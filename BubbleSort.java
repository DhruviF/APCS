import java.util.*;

public class BubbleSort{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> input = new ArrayList<Integer>();

    for(int i = 0; i < 10; i++){
      input.add(scan.nextInt());
    }

    System.out.println("bubbleSort");

    input = bubbleSort(input, input.size());
    System.out.println();
  }
  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> input, int place){
    if(place==0){
      return input;
    }

    System.out.println(input);

    for (int i=0; i<place-1; i++)
        if (input.get(i) > input.get(i+1)){
          int temp = input.get(i);
          input.set(i, input.get(i+1));
          input.set(i+1, temp);
        }
    return bubbleSort(input, place-1);
  }
  
}
