/*
Write a recursive program called WriteNums that takes an integer n
from the console and prints to the console the first n integers,
starting with 1 in sequential order, separated by commas.

For example, an input of 7 should produce 1, 2, 3, 4, 5, 6, 7

In this example, note that there is no trailing space after the 7.

Your method should throw an IllegalArgumentException if passed a
value less than 1.
*/

import java.util.*;

public class WriteNums {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = scan.nextInt();
    if (number < 1){ // don't want a number thats negative or 0
      throw new IllegalArgumentException();
    }
    writeNums(number);
    System.out.println();
  }

  public static int writeNums(int number) {//runs the program to print in sequential order
    if (number == 1)
      System.out.print("1"); //1 is one of the only exceptions for else bc u only print 1
    else {
      writeNums(number - 1);
      System.out.print(", " + number);
    }
    return number;
  }
}
