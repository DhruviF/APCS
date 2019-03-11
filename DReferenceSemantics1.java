import java.util.*;
public class DReferenceSemantics1{
  public static void main(String[] args){
    int[] a = new int[10];

    for (int i =0; i<10;i++){
      a[i] = 9-i;
      System.out.print(a[i]);
    }

    System.out.println("a[]: " + Arrays.toString(a));

    System.out.println("pointer a: " + a);

    System.out.println("result of a[i] = a[a[i]]: ");
    for (int i =0; i<10;i++){
      a[i] = a[a[i]];
      System.out.print(a[i]);
    }
  }
}
