import java.util.*;
import java.lang.*;

public class Fibonacci {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = scan.nextInt();
    System.out.println("Fibonacci = " + Fibonacci(num));
  }

  public static int Fibonacci(int num){
    System.out.println("A" + num);
    if(num <=1)
      return num;
    else
      return (Fibonacci(num-1) + Fibonacci(num-2));
  }
}


    // long first=0;
    // long second=1;
    // long third=2;
    //   for(long i=1; i<=50; i++){
    //     third=first+second;
    //     System.out.println(first);
    //     first=second;
    //     second=third;
    //   }
