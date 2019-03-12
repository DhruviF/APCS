/* Write a program that reverses the elements in an array and prints them out in the following format:
The input to your program will be the size of the array followed by the integers in your list. Use at least
one other method besides the main method (preferably one that takes an array as a parameter).  */

import java.util.*;

public class ReverseArray {
  public static void main(String[] args) {
    //ask for length of list and the numbers in the list
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    int[] numbers = new int[length];
    int smallerNum = 0;

    for (int i = 0; i < length; i++)  {
      numbers[i] = scan.nextInt();
    }

    //run program to reverse array
    swapper(length, numbers);

    System.out.print("[");

    // print a comma between each number
    for (int i = 0; i < length - 1; i++){
      System.out.print(numbers[i] + ", ");
    }

    System.out.print(numbers[length - 1]);
    System.out.print("]");

  }

  public static void swapper(int length, int[] numbers){
    int repetition = length/2;
    int temp = 0; // stores original value to be swapped later

    for (int i = 0; i<repetition; i++){
      // swap the numbers
      temp = numbers[i];
      numbers[i] = numbers[length-(i+1)];
      numbers[length-(i+1)] = temp;
    }
  }

}
