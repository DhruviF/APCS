import java.util.Scanner;

public class Power {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Input base: ");
    int base = scan.nextInt();
    System.out.println("Input power: ");
    int power = scan.nextInt();

    int answer = 0;

    for (int i = 1; i<=power-1; i++){
      for (int j = 1; j<= base; j++){
          answer += base;
      }
    }
    System.out.println("Answer: " + answer);
  }
}
