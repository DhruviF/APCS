/* Find the maximum sum that can be generated from a list of positive
integers that does not exceed a given limit n*/

import java.util.*;

public class MaxSum{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<Integer>();
    int length = scan.nextInt();

    for(int i = 0; i < length; i++){
      list.add(scan.nextInt());
    }

    // while(scan.hasNextInt()){
    // int input = scan.nextInt();
    //   list.add(scan.nextInt());
    // }

    // int length = list.size();
    // int maxNum = list.get((length-1));
    // list.remove(length-1);

    int maxNum = scan.nextInt();

    System.out.print(maxSum(list, list.size(), 0, maxNum));
    System.out.println();
  }

  public static int maxSum(List<Integer> list, int length, int start, int maxNum){

    //accounts for exceptions when either list size or maxNum could be 0
    if(length == 0 || maxNum <= 0){
      return 0;
    }

    int max = list.get(start) + maxSum(list, length-1, start+1, maxNum-list.get(start));
    int temp = maxSum(list, length-1, start+1, maxNum);

    // makes sure that it is the max input and is still less than the maxNum
    if(max <= maxNum && max > temp){
      return max;
    }else{
      return temp;
    }
  }
}
