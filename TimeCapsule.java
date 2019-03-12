public class TimeCapsule{
  public static void main(String[] args){
    top();
    box();
    bottom();
  }
  public static final int height = 13;
  public static void top(){
    for (int star=1; star<=height;star++){
      System.out.print(" ");
    }
      System.out.println("*");
    for (int i = 1; i<= height; i++){
      for (int spaces=1; spaces<=height-i; spaces++){
        System.out.print(" ");
      }
      System.out.print("/");
      for (int o=1;o<=2*i-1;o++){
        System.out.print("o");
      }
      System.out.println("\\");
    }
  }
  public static void box(){
    line();
    body();
    line();
  }
  public static void line(){
    System.out.print("|");
    for (int i=1; i<=2*height-1; i++){
      System.out.print("@");
    }
    System.out.println("|");
  }

  public static void body(){
    for (int j=1; j<=2*height-3;j++){
      System.out.print("|@");
      for (int i=1; i<=2*height-3; i++){
        System.out.print(" ");
      }
      System.out.println("@|");
    }
  }

  public static void bottom(){
    for (int i = 1; i<= height; i++){
      for (int spaces=1; spaces<=i-1; spaces++){
        System.out.print(" ");
      }
      System.out.print("\\");
      for (int o=1;o<=2*(height-i+1)-1;o++){
        System.out.print("o");
      }
      System.out.println("/");
    }
  }
}
