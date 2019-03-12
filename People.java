import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class People{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String input;
    Person p;
    int age;
    double weight;
    String name;

    ArrayList<Person> listOfPeople = new ArrayList<Person>();

    input = scan.nextLine();

    while (!input.equals("stop")){
      p = new Person();
      String[] list = input.split(" ");

      name = list[0];
      p.setName(name);
      age = Integer.parseInt(list[1]);
      p.setAge(age);
      weight = Double.parseDouble(list[2]);
      p.setWeight(weight);

      listOfPeople.add(p);
      input = scan.nextLine();

    }
    // while(!input.equals("stop"));

    // for(Person p1: listOfPeople){
    //   System.out.println(p1);
    // }
    System.out.println("Original list: \n" + listOfPeople.toString());
    Collections.sort(listOfPeople);
    System.out.println("\nSorted list: \n" + listOfPeople.toString());
  }

  // public static void sortData(ArrayList<Person> listOfPeople){
  // }

}
