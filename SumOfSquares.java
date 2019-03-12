/* recursive method to find all the ways to express an integer
as the sum of squares of unique positive integer*/

import java.util.*;
public class SumOfSquares {
  public static boolean notEmpty = false;
  public static void main(String[] args) {

    notEmpty = false;
    Scanner scan = new Scanner(System.in);
    System.out.println("input a positive integer: ");
    int num = scan.nextInt();

    // boolean notEmpty = false;

    ArrayList<Integer> list = new ArrayList<Integer>();

    sumOfSquares(num, list, 1);

    if(!notEmpty){
      System.out.println("[]");
    }

    // if (list.isnotEmpty()){
    //   System.out.println("[]");
    // }

    //System.out.println(list);

  }

  public static void sumOfSquares(int num, ArrayList<Integer> list, int temp){
      if(num < 0){
        return;
      }
      if(num == 0){
        notEmpty = true;
        System.out.println(list);
        return;
      }

      if(temp * temp> num){
        // notEmpty = true;
        return;
      }

      list.add(temp);
      sumOfSquares(num - temp * temp, list, temp+ 1);
      list.remove(list.size() - 1);
      sumOfSquares(num, list, temp + 1);
  }
}
