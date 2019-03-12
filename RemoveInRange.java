/*
Write a program called RemoveInRange that accepts three parameters - an ArrayList of
strings, a beginning string, and an ending string - and removes from the list any
strings that fall alphabetically between the start and end strings, inclusively.
For example, if your method is passed  a list containing the elements */

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class RemoveInRange {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");

    String input = scan.nextLine();
    String[] words = input.split(" ");

    ArrayList<String> originalList = new ArrayList<String>();
    int i = 0;
    while (!words[i].equalsIgnoreCase("lastString")) {
      originalList.add(words[i]);
      i++;
    }

    System.out.println("Your original list: " + originalList.toString());

    System.out.println("\nNow please enter your start String\n");
    String start = scan.nextLine();

    System.out.println("Finally, please enter your end String\n");
    String end = scan.nextLine();

    removeInRange(originalList, start, end);
    System.out.println("Your reduced list: " + originalList.toString());

    //ArrayList<String> reducedList = new ArrayList<String>();
    //System.out.println("Your reduced list: " + reducedList.toString());


  }

  public static void removeInRange(ArrayList<String> originalList,	String start, String end){
		for(int i = 0; i < originalList.size(); i++){
			if(originalList.get(i).compareTo(start) >= 0 && originalList.get(i).compareTo(end) <= 0){
				originalList.remove(i);
				i--;
			}
		}
	}

}
