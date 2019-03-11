
public class Area {
    public static void main(String[] args) {
      //Part 1
      int base = 6;
      int height = 7;
      double area = 0.5 * base * height;
      System.out.println("Area: " + area);
      base = 10; // does not work
      System.out.println("New Area: " + area);

      //Part 2
      int x, y, z;
      int x;
      int y;
      int z;
      x = y = z = 3 + 4 + 2;
      int x = 2.8+1.7; // does not work either it's illegal in java
      System.out.println(x);
    }
}
