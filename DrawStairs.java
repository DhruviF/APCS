import java.util.*;

public class DrawStairs {
//public static int total_stairs = 8;
//public static final int number_of_stairs = total_stairs * 5;

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int i = sc.nextInt();
  System.out.println(i);
  stairs(i);
  //stairs();
}

  public static void stairs(int total_stairs) {
  //public static void stairs() {
    int number_of_stairs = total_stairs * 5;
    for (int i=1; i<=total_stairs; i++) {
      for (int j=1; j<=(number_of_stairs+(i*(-5))); j++) {
          System.out.print(" ");
      }
      stick_figure();
      for(int k=1; k<=((i-1)*5); k++){
          System.out.print(" ");
      }

      System.out.println("*");
      for (int j=1; j<=(number_of_stairs+(i*(-5))); j++) {
          System.out.print(" ");
      }
      stickA();
        for (int k=1; k<=(i*5); k++){
            System.out.print(" ");
        }
        System.out.println("*");
        for (int j=1; j<=(number_of_stairs+(i*(-5))); j++) {
            System.out.print(" ");
        }
        stickB();
        for (int k=1; k<=(i*5); k++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
    for (int z=1; z<=(number_of_stairs+7); z++) {
        System.out.print("*");
    }
}

public static void stick_figure() {
    System.out.print("  o  ******");
}
public static void stickA() {
        System.out.print(" /|\\ *");
}
public static void stickB() {
    System.out.print(" / \\ *");
}
}
