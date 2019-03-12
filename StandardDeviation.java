/*
Write a program that takes in a user input from console which contains:
1. an integer n which is the length of an integer array on line 1
2. the n integers of the array from lines 2 to n+1.
The program should then compute the term in the array with the largest deviation from the mean.
*/



import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;

public class StandardDeviation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the integer array dimension: ");
    int lengthOfArray = scan.nextInt();

    int[] numbers = new int[lengthOfArray];
    System.out.println("Please enter the array elements: ");
    for (int i=0; i<lengthOfArray; i++){
      numbers[i] = scan.nextInt();
    }

    double average = mean(numbers);
    double standardDeviation =0;

    for (int i=0; i<lengthOfArray; i++){
      standardDeviation += Math.pow(numbers[i] - average, 2);
    }

    DecimalFormat df = new DecimalFormat("###.###");
    double sd = Math.sqrt(standardDeviation/(lengthOfArray-1));
    System.out.println("Standard deviation = " + df.format(sd));

  }

  public static double mean(int[] numbers) {
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum / numbers.length;
    }
}
