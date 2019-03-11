import java.util.Scanner;
import java.util.*;

public class CBizzFuzz{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int integer = scan.nextInt();
    calculate(integer);
    
  }

  public static void calculate(int integer){
    int sum=0;
    for(int i=1; i<integer; i++){
      if(i%3==0 || i%5==0){
        sum=sum+i;
      }
      if(i%15==0){
        sum=sum-i;
      }
    }
    System.out.println(sum);
  }
}


//     public static int calculate(int integer){
//       int sum = 0;
//       for (int i = 3; i < integer; i++) {
//         if (i % 3 == 0 || i % 5 == 0) {
//         sum += i;
//         }
//       }
//       return sum;
//     }
// }
