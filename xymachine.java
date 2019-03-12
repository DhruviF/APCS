// deck with cards from 1 to n
// draw 2 cards randomly (x and y)
// (xy + x +y) =  (x + 1)(y+1)-1
// add the new number to the deck and take out x and y
// till you reach that only 1 card is left
//
// n   #    (n+1)!
// 1   1    2
// 2   5    6
// 3   23   24
// 4   119  120
// 5   719  720
//
// f(n) = (n+1)! - 1

import java.util.Scanner;

public class xymachine {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Input the number of cards in the deck: ");
    int x = scan.nextInt();

    int answer = factorial(x+1)-1;

    System.out.println(answer);
  }

    public static int factorial(int n)
    {
        if (n == 0)
          return 1;

        return n*factorial(n-1);
    }

}
