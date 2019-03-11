import java.util.Scanner;

public class HarmonicSeries {
  public static void main(String[] args) {
    double total = 0;
    int number = 0;

    Scanner scan = new Scanner(System.in);
    double maximum = scan.nextDouble();
    int i = 0;

    while (total <= maximum){
      number++;
      total += 1.0/number;
    }
    System.out.print("Actual sum = ");
    System.out.printf("%.5f", total);
    System.out.println();
    System.out.println("Number of terms required: " + number);
  }
}
