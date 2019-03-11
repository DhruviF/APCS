/* Write a method that takes in a string and returns the character
with the highest ASCII value, then returns all the characters in the
string in ascending ASCII order. */

import java.util.Scanner;
import java.util.Arrays;

public class AString {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter string: ");
    String word = console.nextLine();

    int max = 0;

    // max character

    for (int i = 0; i < word.length(); i++){
      int eachChar = (int)word.charAt(i);
      if(eachChar > max)
        max = eachChar;
      }
    char maxChar = (char)max;
    System.out.println("max char:     " + maxChar);
    //System.out.println();
    System.out.println("in order:     " + sortString(word));
  }

  public static String sortString(String inputString)
   {
       //copy characters of input string into an array
       char charArray[] = inputString.toCharArray();
       Arrays.sort(charArray);

       return new String(charArray);
   }
}
