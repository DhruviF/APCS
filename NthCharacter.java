import java.util.*;
public class NthCharacter {
  public static void main(String[] args) {
    int n = 543561;
    int k = 4;

    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    k = scan.nextInt();

    for (int i=1; i<=k; i++){
      n=n/10;
    }

  System.out.println(n%10);
    // String number = Integer.toString(n);
    // System.out.println(number.charAt(number.length()-(k+1)));
  }
}

// public class NthCharacter {
//   public static void main(String[] args) {
//     String number = args[0];
//     int k = Integer.parseInt(args[1]);
//   //String number = Integer.toString(n);
//     System.out.println(number.charAt(number.length()-(k+1)));
//   }
// }
