/* Write a recursive program called BinarySearch which takes in an array of
distinct integers from the console and returns the index of one of those
integers (or -1 if the integer cannot be found). */

import java.util.*;
import java.lang.*;

public class BinarySearch {

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    int length = scan.nextInt();
    for (int i = 0; i < length; i++){
        numbers.add(scan.nextInt());
    }

    int target = scan.nextInt();

    System.out.println(binarySearch(0, numbers, target));
  }

	public static int binarySearch(int start, ArrayList<Integer> numbers, int target){
    int length = numbers.size();
    int divide = numbers.size()/2;

    if (length == 1){
      if(target == numbers.get(0)){
        return start;
      }
      return -1;
    }

    if(numbers.get(divide) > target){
      return binarySearch(start, new ArrayList<Integer>(numbers.subList(0,divide)), target);
    }
    return binarySearch(divide + start, new ArrayList<Integer>(numbers.subList(divide,length)), target);
	}

}
