// What will the following code print?

public class MemesRDreams{
  public static void main(String[] args) {
    dreams();
  }
  public static void grumpyCat() {
     for(int i = 0; i < 5; i +=2) {
      for (int j = i; j < 5 ; j++ ) {
        System.out.print("Meow");
      }
      System.out.println();
    }
  }
  public static void dreams() {
      goat();
      woat();
  }
  public static void woat() {
    System.out.println("Memes r dreams");
    System.out.println();
  }
  public static void goat() {
    System.out.println("");
    for (int i = 0; i < 2; i++ )
      woat();
      grumpyCat();
      woat();
  }
}
