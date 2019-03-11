/*
Write a program called interleave that accepts two ArrayLists of integers list1
and list2 as parameters and inserts the elements of list2 into list1 at alternating
indexes. If the lists are of unequal length, the remaining elements of the longer
list are left at the end of list1.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Interleave {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
    String a1 = scan.nextLine();
    // turns String a1 into an array called arr1
    ArrayList<String> arr1 =  new ArrayList<String> (Arrays.asList(a1.split(" ")));
    //the if loop removes 0 from the end of the array
    if (arr1.get(arr1.size()-1).equals("0")){
      arr1.remove(arr1.size() - 1);
    }
    System.out.println("Your first list: " + arr1.toString());


    System.out.println("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
    String a2 = scan.nextLine();
    // turns String a2 into an array called arr2
    ArrayList<String> arr2 =  new ArrayList<String> (Arrays.asList(a2.split(" ")));
    //the if loop removes 0 from the end of the array
    if (arr2.get(arr2.size()-1).equals("0")){
      arr2.remove(arr2.size() - 1);
    }
    System.out.println("Your second list: " + arr2.toString());

    interleave(arr1, arr2);
    System.out.println("\nYour interleaved list: " + arr1);

  }

  public static void interleave(ArrayList<String> arr1,ArrayList<String> arr2){
    int i = 1; // sets value for arr1
    int j = 0; // sets value for arr2

    while(j < arr2.size()){
      if(i < arr1.size()){
        arr1.add(i, arr2.get(j)); //places arr2 elements alternating into arr1 
        i += 2;
      }
      else{
        arr1.add(arr2.get(j));
        i++;
      }
      j++;
    }
  }

}
