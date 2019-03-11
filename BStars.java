public class BStars {
  public static void main (String[] args){ //doesn't matter where this main function is located
    stars0();
  }
  public static void stars0(){
    stars1();
    stars1();
  }
  public static void stars1(){
    stars2();
    stars2();
  }
  public static void stars2(){
    stars3();
    stars3();
    System.out.println();
  }
  public static void stars3(){
    stars4();
    stars4();
  }
  public static void stars4(){
    System.out.println("*");
  }
}
