import java.util.Scanner;

public class BSquareRootCurve{

  public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Input your grade as a decimal: ");
		double initial = scan.nextDouble();
		boolean b;
		double currentValue= initial;
		b = true;


		for(int i=0; b==true;i++){
			currentValue = (currentValue+(initial/currentValue))/2;

			if(Math.abs((currentValue*currentValue - initial)) < (1e-15)){
				b = false;
			}

		}

		if(currentValue>=0.97){

			System.out.println(currentValue*100+" :A+");
		} else if(currentValue>=0.93){
			System.out.println(currentValue*100+" :A");
		} else if(currentValue>=0.9){
			System.out.println(currentValue*100+" :A-");
		} else if(currentValue>=0.87){
			System.out.println(currentValue*100+" :B+");
		} else if(currentValue>=0.83){
			System.out.println(currentValue*100+" :B");
		} else if(currentValue>=0.8){
			System.out.println(currentValue*100+" :B-");
		} else if(currentValue>=0.77){
			System.out.println(currentValue*100+" :C+");
		} else if(currentValue>=0.73){
			System.out.println(currentValue*100+" :C");
		} else if(currentValue>=0.7){
			System.out.println(currentValue*100+" :C-");
		} else if(currentValue>=0.67){
			System.out.println(currentValue*100+" :D+");
		} else if(currentValue>=0.63){
			System.out.println(currentValue*100+" 😀");
    } else if(currentValue>=0.6){
			System.out.println(currentValue*100+" :D-");
		} else{
			System.out.println(currentValue*100+" :F");
		}

	}
}
