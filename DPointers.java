public class DPointers {
  public static void main(String[] args) {
    //Access pointer addresses by printing without a toString method
    System.out.println();
    MyPointer p1 = new MyPointer(); //class MyPointer contains no toString method
    System.out.println("MyPointer p1 = " +p1);
  }
}


 // a do-nothing class with no toString method
class MyPointer{
  public MyPointer(){

  }
}
