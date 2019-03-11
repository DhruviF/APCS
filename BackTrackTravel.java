/* Write a program to find all the paths from the origin to a given point (x, y).
You may travel only one step at a time in the positive N, E, or NE direction.
To satisy the HG test cases, set up your recursion to explore in this order:
N first, then NE, and finally E. Report each path and the total number of paths.*/

import java.util.*;
public class BackTrackTravel{
  public static int counter = 0;
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
    int x = scan.nextInt();
    int y = scan.nextInt();
    explore(x, y, 0, 0, "moves:");
    System.out.println("Number of paths = " + counter);
  }

  public static void explore(int findx, int findy, int myx, int myy, String printStatement) {
    if (myx == findx && myy == findy){
      System.out.println(printStatement);
      counter+=1;
    }
    else if (myx <= findx && myy <= findy){
      explore(findx, findy, myx, myy+1, printStatement + " N");
      explore(findx, findy, myx+1, myy+1, printStatement + " NE");
      explore(findx, findy, myx+1, myy, printStatement + " E");
    }
  }
}
