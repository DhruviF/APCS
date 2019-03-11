/*
Find the greatest common devisor (GCD) of two integers using
Euclid's algorithm GCD (a,b) = GCD (b, a % b).
Note: GCD (a,0) = |a|.
*/

import java.util.Scanner;

public class A1EuclidGCD{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter positive integer a: ");
    int a = scan.nextInt();
    System.out.println("Enter positive integer b: ");
    int b = scan.nextInt();
        while(b != 0){ // makes sure that you are not inputting the same number
            if(a > b)
              a -= b; //keeps subtracting from it till it reaches a
            else
              b -= a;
        }
        System.out.println("Greatest common divisor (GCD) = " + a);
    }
}
