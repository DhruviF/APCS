/* Write a second recursive program called WriteBinaryString that takes an integer as a parameter
and returns the binary expression of the integer in String format For example, WriteBinaryString(44)
should return 101100. You should print out the binary expression to the console. Your program should
accommodate a negative integer as input.

Note: Integer.toString(int a) is a built-in method in Java which returns a String representing the
specified integer in the parameter. */


import java.util.*;

public class WriteBinaryString {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = scan.nextInt();

    System.out.print("Binary expression: ");

    if (n<0){
      System.out.print("-");
      n = n * -1;
    }
    writeBinaryString(n);

    System.out.println();
  }

  //recursive method
  public static void writeBinaryString(int n) {
    if (n<2){
      System.out.print(n);
    }else{
        writeBinaryString(n/2);
        System.out.print(n%2);
    }
    Integer.toString(n);
  }

}
