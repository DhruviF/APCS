import java.util.Scanner;
public class Sudoku{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // new Sudoku(new int[][] {
    //     {3, 0, 6, 5, 0, 8, 4, 0, 0},
    //     {5, 2, 0, 0, 0, 0, 0, 0, 0},
    //     {0, 8, 7, 0, 0, 0, 0, 3, 1},
    //     {0, 0, 3, 0, 1, 0, 0, 8, 0},
    //     {9, 0, 0, 8, 6, 3, 0, 0, 5},
    //     {0, 5, 0, 0, 9, 0, 6, 0, 0},
    //     {1, 3, 0, 0, 0, 0, 2, 5, 0},
    //     {0, 0, 0, 0, 0, 0, 0, 7, 4},
    //     {0, 0, 5, 2, 0, 6, 3, 0, 0}
    // }).solve();
  }

  private int sudoku[][];
  private int n = 9;

  public Sudoku(int sudoku[][]) {
    this.sudoku = sudoku;
  }

  public void solve() {
    if (!backtrackSolve()) {
      System.out.println("This sudoku can't be solved.");
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(sudoku[i][j] + " ");
      }
      System.out.println();
    }
  }

  public boolean isSuitableToPutXThere(int i, int j, int x) {
    for (int jj = 0; jj < n; jj++) {
      if (sudoku[i][jj] == x) {
        return false;
      }
    }
    for (int ii = 0; ii < n; ii++) {
      if (sudoku[ii][j] == x) {
        return false;
      }
    }
    int boxRow = i - i % 3;
    int boxColumn = j - j % 3;
    for (int ii = 0; ii < 3; ii++) {
      for (int jj = 0; jj < 3; jj++) {
        if (sudoku[boxRow + ii][boxColumn + jj] == x) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean backtrackSolve() {
    int i = 0, j = 0;
    boolean isThereEmptyCell = false;
    for (int ii = 0; ii < n && !isThereEmptyCell; ii++) {
      for (int jj = 0; jj < n && !isThereEmptyCell; jj++) {
        if (sudoku[ii][jj] == 0) {
          isThereEmptyCell = true;
          i = ii;
          j = jj;
        }
      }
    }
    if (!isThereEmptyCell) {
      return true;
    }
    for (int x = 1; x < 10; x++) {
      if (isSuitableToPutXThere(i, j, x)) {
        sudoku[i][j] = x;
        if (backtrackSolve()) {
          return true;
        }
        sudoku[i][j] = 0;
      }
    }
    return false;
  }
}
