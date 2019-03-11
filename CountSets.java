// import java.util.Scanner;
// import java.util.*;
//
// public class CountSets {
//   public static void main(String[] args) {
//
//     Scanner scan = new Scanner(System.in);
//     int quantity = scan.nextInt();
//     int[] numbers = new int[quantity];
//
//     for (int i=0; i<quantity; i++){
//       numbers[i] = scan.nextInt();
//     }
//
//     Arrays.sort(numbers);
//
//     for(int i = 1; i < numbers.length; i++) {
//       if(numbers[i] == numbers[i - 1]) {
//         System.out.println("numbers that repeat = " + numbers[i]);
//       }
//     }
//
//   }
// }

import java.util.Scanner;
import java.util.*;

public class CountSets {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int quantity = scan.nextInt();
    int[] numbers = new int[quantity];

    for (int i=0; i<quantity; i++){
      numbers[i] = scan.nextInt();
    }

    // Arrays.sort(numbers);

    int repeatingNumber = -1;
    int numberOfSets = 0;
    for(int i = 1; i < numbers.length; i++) {
      if(numbers[i] == numbers[i - 1]) {
          if (repeatingNumber != numbers[i]){
              repeatingNumber = numbers[i];
              numberOfSets++;
          }
      }
    }

    System.out.println(numberOfSets);

  }
}
