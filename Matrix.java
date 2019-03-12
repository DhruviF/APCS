import java.util.Scanner;

public class Matrix{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);

    int rows1 = scan.nextInt();
    int columns1 = scan.nextInt();
    int[][] matrix1 = new int[rows1][columns1];
    for (int i =0; i<rows1; i++){
      for (int j =0; j<columns1; j++){
        matrix1[i][j] = scan.nextInt();
      }
    }

    int rows2 = scan.nextInt();
    if (columns1 != rows2){
      System.out.println("Incompatible matrices!");
      System.exit(0);
    }


    int columns2 = scan.nextInt();
    int[][] matrix2 = new int[rows2][columns2];
    for (int i =0; i<rows2; i++){
      for (int j =0; j<columns2; j++){
        matrix2[i][j] = scan.nextInt();
      }
    }

    int[][] result = new int[rows1][columns2];
    int sum=0;
    for(int i=0;i<rows1;i++){
      for(int j=0;j<columns2;j++){
        for(int k=0;k<rows2;k++){
          sum += matrix1[i][k] * matrix2[k][j];
        }
        result[i][j]= sum;
        System.out.printf("%4d", sum);
        sum = 0;
      }
      System.out.print("\n");
    }


  }
}
