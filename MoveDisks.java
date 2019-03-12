/* Write a program using recursion to move n disks from a source post to a destination
post using a third post for temporary storage. The disks are initially stacked on
the source post with the largest disk on the bottom, progressively smaller disks above,
and the smallest disk on top. Only one disk at a time can be moved, and a larger disk can never be placed on a
smaller disk. The source post will always be post A. The destination post can be either post B or
post C, specified by the user.

Input:  The number of disks to be moved and the destination post, B or C (upper case
only).

Output:  A series of moves that will move the disks from post A to post B in the
least possible number of moves, and the total number of moves required. */

import java.util.*;
import java.lang.*;

public class MoveDisks {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = scan.nextInt();
    System.out.print("Enter destination post: ");
    String dest = scan.next();
    char destination = 'B';
    char temp = 'C';
    if (dest.equals("C")){
      destination = 'C';
      temp = 'B';
    }
    //
    // if (destination == 'B'){
    //   char temp = 'C';
    // }else{
    //   char temp = 'B';
    // }
    System.out.print("Moves:\n");
    moveDisks(n, 'A', destination, temp);

    int numberOfMoves = (int)Math.pow(2, n)-1;
    System.out.println("Number of moves: " + numberOfMoves);
  }
  public static void moveDisks(int n, char source, char destination, char temp){
    if (n == 1){
      moveOneDisk(source, destination);
      // return 1;
      // System.out.println(source + " -> " + destination);
    }else{
      moveDisks(n-1, source, temp, destination);
      // System.out.println(source + " -> " + destination);
      moveOneDisk(source, destination);
      moveDisks(n-1, temp, destination, source);
      // return 2 * (n-1) + 1;
    }
  }

  public static void moveOneDisk(char source, char destination){
    System.out.println(source + " -> " + destination);
  }

}
