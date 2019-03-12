import java.util.*;
import java.io.*;

public class Maps {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long initialCount = scan.nextLong();
    long forgottenCount = scan.nextLong();
    long favoriteCount = scan.nextLong();

    Hashtable<String, Long> words = new Hashtable<String, Long>();
    Hashtable<String, Long> additionalWords = new Hashtable<String, Long>();

    String word;
    long wordCount;
    String input;
    long total = 0;

    for (int i=0; i<initialCount;i++){
      word = scan.next();
      wordCount = scan.nextLong();
      words.put(word, wordCount);
    }

    for (int i=0; i<forgottenCount;i++){
      word = scan.next();
      wordCount = scan.nextLong();
      additionalWords.put(word, wordCount);
    }

    for (int i=0; i<favoriteCount;i++){
      input = scan.next();
      if (words.get(input) != null){
        total += words.get(input);
      }
      if (additionalWords.get(input) != null){
        total += additionalWords.get(input);
      }
    }

    long mod = (long) Math.pow(10,9)+7;
    total = total%mod;
    System.out.println(total);

  }
}
