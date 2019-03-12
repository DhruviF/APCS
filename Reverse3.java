/* Write a program Reverse3 that accepts an ArrayList of integer values as
a parameter and reverses each successive sequence of three values in the
list. If the list has remaining values that are not part of a sequence of three,
those values are unchanged. */

import java.util.*;

public class Reverse3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");

    ArrayList<Integer> originalList = new ArrayList<Integer>();
    int input = scan.nextInt();

    while (input != 0) {
      originalList.add(input);
      input = scan.nextInt();
    }

    System.out.println("Your original list: " + originalList.toString());
    reverse3(originalList);
    System.out.println("\nYour reversed3 list: " + originalList.toString());

  }


  public static void reverse3(ArrayList<Integer> originalList) {
    for (int i = 0; i < originalList.size()-2; i+=3) {
      int one = originalList.get(i);
      int three = originalList.get(i + 2);
      originalList.set(i, three);
      originalList.set(i+2, one);
    }
  }

}
