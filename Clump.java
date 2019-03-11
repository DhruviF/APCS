/*
Write a program called clump that accepts an ArrayList of strings as a
parameter and replaces each pair of strings with a single string that
consists of the two original strings in parentheses separated by a space.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Clump {

  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.println("\nPlease enter a sequence of strings separated\nby spaces. End the sequence with the sentinel\nvalue \"stop\", followed by a return.\n");

    String input = console.nextLine();
    //turns string into an array of words
    ArrayList<String> words =  new ArrayList<String> (Arrays.asList(input.split(" ")));

    //removes the last stop word at the end of the array
    if (words.get(words.size()-1).equals("stop")){
      words.remove(words.size() - 1);
    }

    System.out.println("Your original list: " + words.toString());

    clump(words);
    System.out.println("\nYour clumped list: " + words.toString());
  }

  public static void clump(ArrayList<String> words){
    for(int i = 0; i < words.size() - 1; i++){
      String couples = "(" + words.get(i) + " " + words.get(i + 1) + ")";//places 2 consecutive words togetehr between parantheses
      words.set(i, couples);
      words.remove(i + 1);
    }
  }

}
