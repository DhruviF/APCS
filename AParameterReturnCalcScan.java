/* This number accepts two doubles from the user and calculates a few mathematical functions*/
import java.util.Scanner;

public class AParameterReturnCalcScan {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input one number: ");
    double one = scan.nextDouble();
    System.out.println("Input another number: ");
    double two = scan.nextDouble();

    double sum = add(one,two);
    double difference = subtract(one,two);
    double product = multiply(one,two);
    double quotient = divide(one,two);

    System.out.println("sum: " + sum);
    System.out.println("difference: " + difference);
    System.out.println("product: " + product);
    System.out.println("quotient: " + quotient);

  }

    public static double add(double d1, double d2){
      return d1+d2;
    }

    public static double subtract(double d1, double d2){
      return d1-d2;
    }

    public static double multiply(double d1, double d2){
      return d1*d2;
    }

    public static double divide(double d1, double d2){
      return d1/d2;
    }

}
