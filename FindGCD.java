/* Write a recursive program called FindGCD that calculates the greatest
common divisor, or largest positive integer that goes evenly into two
different integers. Each of the starting integers can be positive, negative,
or 0. Your program should always return a positive GCD, even if one or both
of the starting integers are negative. */

import java.util.*;

public class FindGCD {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n1 = scan.nextInt();
    System.out.print("Enter an integer: ");
    int n2 = scan.nextInt();
    System.out.println("GCD = " + findGCD(n1, n2));
  }

  public static int findGCD(int a, int b){
    if(!(a == 0 || b == 0)){
      // uses recursive method and reverses numbers
      return findGCD(b,a%b);
    }else{
      // if one of the number is 0, the other number will automatically be the gcd
      return a+b;
    }
  }

}
