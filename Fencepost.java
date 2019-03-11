
import java.util.Scanner;

public class Fencepost {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a word: ");
    String input = scan.nextLine();

      String[] items = input.split(".");
      int itemIndex = 1;
      for (String item : items) {
         System.out.println(itemIndex + ". " + item);
         itemIndex++;

      System.out.println(input);
      }
   }
}
