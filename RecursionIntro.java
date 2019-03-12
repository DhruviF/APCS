import java.util.*;

public class RecursionIntro{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = console.nextInt();

		//infiniteRecursion(number);
		//printStarsForLoop(number);
		//printStarsRecursion(number);
		//printBackwardsRecursion(number);
		//printForwardsRecursion(number);
		//printBackwardsThenForwardsRecursion(number);
		printForwardsThenBackwardsRecursion(number);
	}
	public static void infiniteRecursion(int num){
		System.out.println(num);
		infiniteRecursion(num+1);
	}
	public static void printStarsForLoop(int num){
		for (int i=1; i <= num; i++){
			System.out.println("*");
		}
	}
	public static void printStarsRecursion(int num){
		if (num==0){

		} else {
			System.out.println("*");
			printStarsRecursion(num-1);
		}
	}
	public static void printBackwardsRecursion(int num){
		if (num==0){

		} else {
			System.out.println(num);
			printBackwardsRecursion(num-1);
		}
	}
	public static void printForwardsRecursion(int num){
		if (num==0){
			return;
		} else {
			printForwardsRecursion(num-1);
			System.out.println(num);
		}
	}
	public static void printBackwardsThenForwardsRecursion(int num){
		if (num==0){
			System.out.println();
		} else {
			System.out.println(num);
			printBackwardsThenForwardsRecursion(num-1);
			System.out.println(num);
		}
	}
	// public static void printForwardsThenBackwardsRecursion(int num){
	// 	if (num==0){
	// 		System.out.println();
	// 	} else {
	// 		printForwardsThenBackwardsRecursion(num-1);
	// 		System.out.println(num);
  //
	// 	}
	// }

  public static void printForwardsThenBackwardsRecursion(int num, int counter){
		if (num==0){
			System.out.println();
		} else {
			System.out.println(counter);
      counter +=1;
      printForwardsThenBackwardsRecursion(num-1, counter);
			System.out.println(counter-1);

		}
	}
}
