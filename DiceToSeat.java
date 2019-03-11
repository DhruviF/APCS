import java.util.*;

public class DiceToSeat{
  public static void main(String[] args){

// //version 1
    // Scanner console = new Scanner(System.in);
    // System.out.print("Enter the sum of the dice roll (2-12): ");
    // int diceRoll = console.nextInt();
    // double decimalSeat = 3.5 * diceRoll - 6;
    // System.out.println("decimal seat # = " + decimalSeat);

    // int integerSeat = (int) decimalSeat;
    // System.out.println("integer seat number = " + integerSeat);

    // int integerSeatRound = (int) Math.round(decimalSeat);
    // System.out.println("rounded seat number = " + integerSeatRound);

// //version 2
    // double digitalSeatNumber = (Math.random()*36)+1;
    // System.out.println("digitalSeatNumber = " + digitalSeatNumber);
    // int integerSeatNumber = (int) digitalSeatNumber;
    // System.out.println("integer seat number = " + integerSeatNumber);

//version 3
    int seatNumber = (int)Math.ceil(Math.random()* 36);
    System.out.println("seat number = " + seatNumber);

  }
}
