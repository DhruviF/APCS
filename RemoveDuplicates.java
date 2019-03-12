/* Write a class called RemoveDuplicates that takes a sorted ArrayList of
strings and eliminates any duplicates from the list.  */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class RemoveDuplicates {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");

    String word = console.nextLine();
    int length = word.length();

    //turns a string into an array by reading the spaces and splitting the string
    ArrayList<String> inputArray =  new ArrayList<String> (Arrays.asList(word.split(" ")));
    int size = inputArray.size();
    //removes lastString from the array
    if (inputArray.get(inputArray.size()-1).equals("lastString")){
      inputArray.remove(inputArray.size() - 1);
    }
    //print original list using toString
    System.out.println("\nYour original list: " + inputArray.toString());

    removeDuplicates(inputArray);

    System.out.println("\nYour list with duplicates removed: " + inputArray.toString());
    System.out.println("");
  }

  public static void removeDuplicates(ArrayList<String> list) {
    //searches for duplicates and removes them
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i).equalsIgnoreCase(list.get(i + 1))) {//ignorescase makes sure that different cases of the same letter are read as the same letter
        list.remove(i + 1);
        i--;
      }
    }
  }

}
