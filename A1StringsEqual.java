//preview of pointers and null

public class A1StringsEqual{
  public static void main(String[]args){
    String s1 = new String("hello");
    String s2 = new String("hello");

    if(s1==s2){
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    if(s1.equals(s2)){
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}

//returns false
