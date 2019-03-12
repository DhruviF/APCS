import java.util.Scanner;

public class WaysToClimb{
  public static int counter= 0;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of stairs to climb (positive integer): ");
    int n = scan.nextInt();

    waysToClimb(n);
    System.out.println("Total number of ways = " + counter);
  }

  public static void waysToClimb(int n){
  	recurse(n, "[");
  }
  //helper method
  public static void recurse(int n, String s){
  	//base cases
  	if (n < 0) return;
  	if (n == 0) {
  		//fencepost
  		System.out.print(s.substring(0,s.length()-2));
  		System.out.println("]");
      counter++;
  		return;
  	}
  	//recursive cases
  	recurse(n-1, s+"1, ");
  	recurse(n-2, s+"2, ");
  }

}
