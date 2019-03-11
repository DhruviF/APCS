import java.util.Scanner;

public class LCMandGCD{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter positive integer a: ");
    int num1 = scan.nextInt();
    System.out.print("Please enter positive integer b: ");
    int num2 = scan.nextInt();

    int GCD = GCD(num1,num2);
    //lcm can be found by dividing the product of the two numbers and dividing it by the gcs
    int LCM = (num1*num2)/GCD;

    System.out.print("LCM = " + LCM);
    System.out.println("\nGCD = " + GCD);

    //boolean to test if (LCM * GCD) == (a * b)
    System.out.print("(LCM * GCD) == (a * b): ");
    if ((LCM*GCD) == (num1*num2)){
      System.out.print("true\n");
    }else{
      System.out.print("false\n");
    }

  }

  public static int GCD(int num1, int num2){
    int GCD =1;
    //finds greatest common denominator of both numbers
    for(int i = 1; (i <= num1) && (i <= num2); i++){
      if(num1 % i == 0 && num2 % i == 0)
        GCD = i;
    }
    return GCD;
  }

}
