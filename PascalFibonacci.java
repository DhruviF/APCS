/* A program that can generate the first 92 rows of Pascal’s triangle  */

import java.util.Scanner;
import java.util.function.BiConsumer;

public class PascalFibonacci {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input row index: ");
    int rowIndex = scanner.nextInt();
    System.out.print("Input column index: ");
    int columnIndex = scanner.nextInt();

    int combinedIndex = rowIndex + columnIndex + 1;
    long[][] pascalsTriangle = new long[combinedIndex][];

    buildPascalsTriangle(pascalsTriangle);
    //printPascalsTriangle(pascalsTriangle);
    printShadowDiagonal(pascalsTriangle, combinedIndex);
    printBottomRow(pascalsTriangle);
  }

  public static void buildPascalsTriangle(long[][] triangle){
    for(int i = 0; i<triangle.length;i++){
      triangle[i] = new long[i+1];
      triangle[i][0] = 1;
      triangle[i][i] = 1;
      for (int j = 1; j < i; j++){
        // if previous row/col values were zero due to large numbers, current row/col will also be zero.
        if ( (triangle[i-1][j-1] == 0) || (triangle[i-1][j] ==0) )
          triangle[i][j] = 0;
        else
          triangle[i][j] = triangle[i-1][j-1]+triangle[i-1][j];

        // set value to zero when addition of longs results in a negative number
        if (triangle[i][j] < 0)
          triangle[i][j] = 0;
      }
    }
  }

  // Prints pascal's triangle.
  public static void printPascalsTriangle(long[][] triangle){
    for (int i =0; i< triangle.length; i++){
      for (int j =0; j< triangle[i].length; j++){
        System.out.print(triangle[i][j]+ " ");
      }
      System.out.println();
    }
  }

  // Prints all the shadow diagonal values
  public static void printShadowDiagonal(long[][] triangle, int startingRow)
  {
    int i = startingRow-1;
    int j = 0;
    long fib = 0;

    while(triangle[i].length - 1 >= j)
    {
      String str = "arrPascal[" + (i) + "][" + j + "]";
      System.out.printf("%-17s = %d\n", str, triangle[i][j]);
      fib+=triangle[i][j];
      i--;
      j++;
    }
    System.out.print("-----------------------\n");
    System.out.printf("%-17s = %d\n", "Fibonacci(" + startingRow + ")", fib);

  }

  // Prints the bottom row of pascals triangle
  public static void printBottomRow(long[][] triangle){
    int bottomRow = triangle.length-1;
    int rowSize = triangle[bottomRow].length;
    System.out.print("[");
    for (int i = 0; i < rowSize; i++)
    {
      System.out.print(triangle[bottomRow][i]);
      if (i < rowSize - 1)
      System.out.print(", ");
    }
    System.out.print("]");
  }
}
