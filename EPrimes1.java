/*
Write a program that takes console input for a positive integer value
n (n >= 2) on the first line and then prints out the greatest prime number
less than or equal to n and the greatest prime factor of n
on the two following lines. Aim for efficiency.
*/

import java.util.Scanner;

public class EPrimes1 {
  public static void main(String[] args) {
    //asks user for input
    Scanner scan = new Scanner(System.in);
    // System.out.print("Enter positive integer: ");
    int i = scan.nextInt();
    int j =i;
    int k =i;
    while(!largestPrime(i)){
            i--;
    }
    System.out.println(i); //prints out the greatest prime number less than or equal to n
    System.out.println(biggerPrime(k)); // prints the least prime number greater than or equal to n
    System.out.println(factor(j)); // prints the greatest prime factor of n
  }

  public static int factor(int number) { //finds all the prime factors of n
    int i;
    for (i = 2; i <= number; i++) {
      if (number % i == 0) {
        number /= i;
        i--;
      }
    }
    return i;
  }

  public static boolean largestPrime(int m){ // finds largest prime number equal or less than n
    int i=m;
    if (m == 2) { // makes the code more efficient by getting rid of even numbers
      return true;
    }
    if (m % 2 == 0) {
      return false;
    }
    for(int j=3;j<=Math.sqrt(i);j += 2){ //only have to check up to square root because after that all factors have already been checked once
      if(i%j == 0){
      return false;
      }
    }
    return true;
  }

  public static int biggerPrime(int newer) { // finds the next biggest prime number greater than n
        while (!largestPrime(newer)) {
            newer++;
        }
        return newer;
  }


}
