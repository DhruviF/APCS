import java.util.*;
import java.lang.*;

public class AddElements {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of integer array: ");
    int length = scan.nextInt();
    System.out.println("Enter n integers separated by spaces: ");

    int data[] = new int[length];
    // ArrayList<Integer> data = new ArrayList<Integer> ();
    int input;

    // for(int i=0; i<length; i++){
    //   input = scan.next();
    //   data.add(input);
    // }

    for(int i=0;i<length;i++){
      data[i]=scan.nextInt();
    }

    System.out.println("The sum of the elements in your list: " + total(data, length));

  }

  public static int total(int data[], int length){
    if (length <= 0)
        return 0;
    return (total(data, length - 1) + data[length - 1]);
  }

}
