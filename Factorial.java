import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    BigInteger f = new BigInteger("1");
    BigInteger prime = new BigInteger("179424691");
    System.out.println(Factorial(n).mod(prime));
    System.out.println(SuperFactorial(n).mod(prime));
    System.out.println(UltraFactorial(n).mod(prime));
  }

  public static BigInteger Factorial(int n){
    BigInteger prime = new BigInteger("179424691");
    BigInteger factorial = BigInteger.ONE;
    for(int i=2;i<=n;i++){
      factorial=(factorial.multiply(BigInteger.valueOf(i))).mod(prime);
    }
    return factorial;
  }


  public static BigInteger SuperFactorial(int n){
    BigInteger prime = new BigInteger("179424691");
    BigInteger superFactorial = BigInteger.ONE;
    for (int i =2; i <=n;i++){
      superFactorial = (superFactorial.multiply(Factorial(i))).mod(prime);
    }
    return superFactorial;
  }

  public static BigInteger UltraFactorial(int n){
    BigInteger prime = new BigInteger("179424691");
    BigInteger ultraFactorial = BigInteger.ONE;
    for (int i =2; i <=n;i++){
      ultraFactorial = (ultraFactorial.multiply(SuperFactorial(i))).mod(prime);
    }
    return ultraFactorial;
  }
}
