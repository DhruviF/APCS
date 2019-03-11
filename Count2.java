import java.util.*;

public class Count2 {

	public static void main(String args[])
	{
    Scanner scan = new Scanner(System.in);
    System.out.println("\nPlease enter a sequence of strings separated\n" +
    		"by spaces. The end of the sequence must be signified using\n" +
    		"the sentinel value lastString, followed by a return.\n");

    ArrayList<String> inputArray = new ArrayList<String>();
	ArrayList<WordCount> wordCounter = new ArrayList<WordCount> ();

    String lastString = scan.next();
//	if (lastString.equalsIgnoreCase("laststring")){
//		//System.out.println("Your original list: []");
//		//System.out.println("Count: []");
//		return;
//	}
//
    while(!lastString.equalsIgnoreCase("laststring")) {
      inputArray.add(lastString);
      lastString = scan.next().toLowerCase();
    }

    //System.out.println("Your original list: " + inputArray.toString());

		//String previousValue = inputArray.get(0);
		int numberOfInputElements = inputArray.size();
		//int wordOccurenceCounter = 1;

		String currentValue = "";
		for (int i = 0; i < numberOfInputElements; i++)
		{
			currentValue = inputArray.get(i);
			incrementCount(currentValue, wordCounter);
//			if (currentValue.equalsIgnoreCase(previousValue))
//				wordOccurenceCounter++;
//			else
//			{
//				wordCounter.add(wordOccurenceCounter);
//				wordOccurenceCounter = 1;
//				previousValue = currentValue;
//			}

		}

		// log the count for last element/word
		//wordCounter.add(wordOccurenceCounter);

		Collections.sort(wordCounter);
		int size = wordCounter.size();
		for(int i = 0; i < size; i++)
		{
			WordCount wc = wordCounter.get(i);
			System.out.println(wc.toString());
		}
	}

	public static void incrementCount(String word, ArrayList<WordCount> wordCounter)
	{
		int size = wordCounter.size();
		WordCount wc ;
		for(int i = 0; i < size; i++)
		{
			wc = wordCounter.get(i);
			if (wc.word.equalsIgnoreCase(word))
			{
				wc.count++;
				return;
			}
		}
		wordCounter.add(new WordCount(word, 1));
	}
}

class WordCount implements Comparable<WordCount>
{
	String word;
	int count = 1;

	public WordCount(String word, int count)
	{
		this.word = word;
		this.count = count;
	}

	public String toString()
	{
		return this.word + " " + this.count;
	}

	@Override public int compareTo(WordCount wc)
	{
		if (this.count > wc.count)
			return +1;
		else if (this.count < wc.count)
			return -1;
		else
			return 0;
	}
}
