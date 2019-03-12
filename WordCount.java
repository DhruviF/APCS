import java.util.*;
import java.io.*;

public class WordCount {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(System.in);
    String text =input.next();
    input = new Scanner(new File(text));
    int counter =0;
    while (input.hasNext()){
      String n = input.next();
        counter++;
    }
    System.out.println("Total words = " + counter);
  }
}
