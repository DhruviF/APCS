/*
Write a program that takes in a user input from console which contains:
1. an integer n which is the length of an integer array on line 1
2. the n integers of the array from lines 2 to n+1.
The program should then compute the term in the array with the largest deviation from the mean.
*/

import java.util.Scanner;
import java.lang.Math.*;

public class GreatestDeviation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int lengthOfArray = scan.nextInt();

    int[] numbers = new int[lengthOfArray];

    for (int i=0; i<lengthOfArray; i++){
      numbers[i] = scan.nextInt();
    }

    double average = mean(numbers);

    double differenceOfFirst = Math.abs(average - numbers[0]);
    double differenceOfLast = Math.abs(average - numbers[lengthOfArray-1]);

    if (differenceOfLast>differenceOfFirst)
      System.out.println(numbers[lengthOfArray-1]);
    else
      System.out.println(numbers[0]);
       
    // double[] difference =  new double[lengthOfArray];
    // for (int j = 0; j<lengthOfArray; j++){
    //   difference[j] = Math.abs(numbers[j] - average);
    // }
    // System.out.println(difference);
  }

  public static double mean(int[] numbers) {
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum / numbers.length;
    }
}
