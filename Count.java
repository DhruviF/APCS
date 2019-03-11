import java.util.*;

public class Count {

	public static void main(String args[])
	{
    Scanner scan = new Scanner(System.in);
    System.out.println("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");
    System.out.println();

    ArrayList<String> inputArray = new ArrayList<String>();
		ArrayList<Integer> wordCounter = new ArrayList<Integer> ();

    String lastString = scan.next();
		if (lastString.equalsIgnoreCase("laststring")){
			System.out.println("Your original list: []");
			System.out.println("Count: []");
			return;
		}
    while(!lastString.equalsIgnoreCase("laststring")) {
      inputArray.add(lastString);
      lastString = scan.next().toLowerCase();
    }

    System.out.println("Your original list: " + inputArray.toString());

		String previousValue = inputArray.get(0);
		int numberOfInputElements = inputArray.size();
		int wordOccurenceCounter = 1;

		String currentValue = "";
		for (int i = 1; i < numberOfInputElements; i++)
		{
			currentValue = inputArray.get(i);
			if (currentValue.equalsIgnoreCase(previousValue))
				wordOccurenceCounter++;
			else
			{
				wordCounter.add(wordOccurenceCounter);
				wordOccurenceCounter = 1;
				previousValue = currentValue;
			}
		}

		// log the count for last element/word
		wordCounter.add(wordOccurenceCounter);

		Collections.sort(wordCounter);
		System.out.println("Count: " + wordCounter.toString());
	}
}
