/* Using recursion, write a program to print out all possible permutations
of an input string of letters (no duplicate permutations) in sorted alphabetical
order. */

import java.util.*;

public class Permute{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input string: ");
    String word = scan.nextLine();
    TreeSet<String> words = new TreeSet<String>();

    permute("", word, words);
    for(String w: words){
      System.out.println(w);
    }
  }

  public static void permute(String start, String word, TreeSet<String> words) {
    int length = word.length();
    if (length == 0){
      words.add(start);
    }else{
      for (int i = 0; i < length; i++){
        permute(start + word.charAt(i), word.substring(0, i) + word.substring(i + 1, length), words);
      }
    }
  }

}
