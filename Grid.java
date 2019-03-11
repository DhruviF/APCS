import java.util.Scanner;
public class Grid {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input the size of the grid: ");
    int n = scan.nextInt();

    String[][] grid = new String[n][n];

    for (int row=0; row<n; row++){
      for (int col=0; col<n; col++){
        grid[row][col] = null;
      }
    }

    for (int row=0; row<n; row++){
      for (int col=0; col<n; col++){
        markCharacter(grid, row, col, n);
      }
    }

    for (int row=0; row<n; row++){
      for (int col=0; col<n; col++){
        System.out.print(grid[row][col] + " ");
      }
      System.out.println();
    }

  }

  public static void markCharacter(String grid[][], int row, int col, int n){
    if(grid[row][col] == null){
      grid[row][col] = "C";
      block(grid, row, col, n);
    }
  }

  public static void block(String grid[][], int row, int col, int n){

    //block all row elements
    for(int c=0; c<n; c++){
      if(grid[row][c] == null){
        grid[row][c] = "-";
      }
    }

    //block all col elements
    for(int r=0; r<n; r++){
      if(grid[r][col] == null){
        grid[r][col] = "-";
      }
    }

    //block all diagonal elements
    for(int offset=0; offset<n; offset++){
      if((row+offset)<n && (col+offset)<n && grid[row+offset][col+offset] == null){
        grid[row+offset][col+offset] = "-";
      }
      if((row-offset)>=0 && (col-offset)>=0 && grid[row-offset][col-offset] == null){
        grid[row-offset][col-offset] = "-";
      }
      if((row+offset)<n && (col-offset)>=0 && grid[row+offset][col-offset] == null){
        grid[row+offset][col-offset] = "-";
      }
      if((row-offset)>=0 && (col+offset)<n && grid[row-offset][col+offset] == null){
        grid[row-offset][col+offset] = "-";
      }
    }

  }

}
