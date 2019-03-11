/*
Write a program that takes in an array of integers from the console and
another integer value and returns the last index at which that value occurs
in the aray.  Your program should return -1 if the value is not found.  For
example, in the array [74, 85, 102, 99, 101, 85, 56], the last index of the
value 85 is 5.  Assume the array is always seven elements long.
*/

import java.util.Scanner;

public class LastIndexOf {
  public static void main(String[] args) {
    int[] numbers = new int[7];
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter seven elements of an integer array and a value: ");
    numbers[0] = scan.nextInt();
    numbers[1] = scan.nextInt();
    numbers[2] = scan.nextInt();
    numbers[3] = scan.nextInt();
    numbers[4] = scan.nextInt();
    numbers[5] = scan.nextInt();
    numbers[6] = scan.nextInt();
    int numberToFind = scan.nextInt();

    int index = -1;
    for (int i = 0; i < 7; i++){
      if (numbers[i] == numberToFind)
        index = i;
    }

    System.out.println("Last index of value = " + index);

  }
}
