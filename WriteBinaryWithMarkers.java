import java.util.Scanner;

public class WriteBinaryWithMarkers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int n = scan.nextInt();

    char marker1 = 'a' - 1;
    char marker2 = 'h' - 1;
    char marker3 = 'p' - 1;

    writeBinaryWithMarkers(n, marker1, marker2, marker3);
    System.out.println();
  }

  //recursive method
  public static void writeBinaryWithMarkers(int n, char n1, char n2, char n3){
    n1++;
    System.out.print(n1);
    if (n>1){
      writeBinaryWithMarkers(n/2, n1, n2, n3);
      n2++;
      System.out.print(n2);
    }
    System.out.print(" " + n%2 + " ");
    n3++;
    System.out.print(n3);
  }
}
