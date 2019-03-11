/*
A program that finds the distribution of leading digits in a set of positive integers.
This program will be useful for exploring the phenomenon known as Benford's Law.
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException; // Possible exception when reading a file
import java.io.IOException; // Possible exception during I/O

public class Benford {
  public static void main(String[] args) throws FileNotFoundException, IOException
  {

    String filename;
    int[] counts = new int[] { 0,0,0,0,0,0,0,0,0,0}; //initializes the counts array that holds the count of all leading digits

    System.out.println("Let us count those leading digits...");
    System.out.print("input file name? "); //Accept the filename that contains the input data
    Scanner scan = new Scanner(System.in);
    filename = scan.nextLine();

    //Read the input data from the file
    File file = new File(filename);
    BufferedReader reader = new BufferedReader(new FileReader(filename));

    int leadingDigit = -1; //will hold the leading digit for a number

    String line;
    int totalInts = 0;
    int number = -1;
    int numberOfZeroes = 0;
    while ((line = reader.readLine()) != null) {
        number = Integer.parseInt(line);
        if (number == 0){
            numberOfZeroes++;
        } else{
            totalInts++;                                        // Maintains the count of non-zero integers in input file
            leadingDigit = getLeadingDigit(number);             // Get the leading digit
            counts[leadingDigit] = counts[leadingDigit] + 1;    // Increment the appropriate leading digit counter
        }
    }

    if (numberOfZeroes > 0)
    {
        System.out.print("excluding " + numberOfZeroes + " zeros\n");
    }
    System.out.println("Digit Count Percent");
    for (int i = 1; i < 10; i++){
        System.out.printf("    %1d    %2d  %5.2f\n", i, counts[i], ((counts[i]/(float)totalInts)*100));
        //the % symbols in this line help with the spacing of the numbers
    }
    System.out.println("Total    " + totalInts + " 100.00");
  }

  // This method computes the leading digit by repeated dividing the input number/quotient by 10 until the quotient is less than 10, which will give us the leading digit
  public static int getLeadingDigit(int number){

      while (number > 9)
      {
          number = number / 10;
      }
      return number;
  }
}
