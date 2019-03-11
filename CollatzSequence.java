import java.util.*;

public class Collatz2{
	public static void main(String[] args){
		System.out.print("Enter nUMBER of terms followed by terms: ");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int base=0;
    int biggestValue=0;


		int nextn=0;
		int og=0;


		for(int i=0; i<n; i++){
			input = scan.nextInt();
			base=0;

			for(int j=0; j<100; j++){
        while(nextn>1 && input%2==0){
          base=base+1;
					input==input/2;

				}
        while(input%2==1 && nextn>1){
        	base==base+1;
					input==input*3 +1;
				}



			}
			System.out.println(base+1);

			if(base>og){
				og==base+1;
				biggestValue==base+1;
			}
		}
		System.out.println("Longest: "+biggestValue);
	}
}
