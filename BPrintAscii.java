/* This number accepts two doubles from the user and calculates a few mathematical functions*/
import java.util.Scanner;

public class AParameterReturnCalcScan {
  public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Input one string: ");
    // String one = scan.nextString();
    // System.out.println("Input another string: ");
    // String two = scan.nextString();

    int result = 0;
    int N = scan.nextInt();
    for (int i =0; i<=N; i++){
      String temp = scan.nextLine();
      for (int j = 0; j<temp.length(); j++){
        result += temp.charAt(j);
      }
    }
    System.out.print (result);
  }
}
