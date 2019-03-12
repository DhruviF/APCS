import java.util.Scanner;

public class WriteBinary {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = scan.nextInt();
    if (n<0){
      System.out.print("-");
      n = n * -1;
    }
    writeBinary(n);
    System.out.println();
  }

  public static void writeBinary(int n){
    if(n<2){
      System.out.print(n);
    }else{
      writeBinary(n/2);
      writeBinary(n%2);
    }
  }

}
