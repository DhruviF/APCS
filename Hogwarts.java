import java.util.Scanner;

public class Hogwarts
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++)
        {
            numbers[i] = scan.nextInt();
        }

        int numberOfChars = length/4;

        for (int i = 0; i < numberOfChars; i = i + 2)
        {
            if ((i+2) <= numberOfChars)
                swap(numbers, i);
        }

        char char1;
        for (int i = 0; i < numberOfChars; i++)
        {
            char1 = (char) (numbers[i*4] + numbers[i*4+1] + numbers[i*4+2] + numbers[i*4+3]);
            System.out.print("" + char1);
        }

        System.out.print("\n");
    }

    public static void swap(int[] numbers, int i){
        int temp;

        temp = numbers[(i*4)+1];
        numbers[(i*4)+1] = numbers[(i*4)+5];
        numbers[(i*4)+5] = temp;

        temp = numbers[(i*4)+2];
        numbers[(i*4)+2] = numbers[(i*4)+6];
        numbers[(i*4)+6] = temp;
    }


}
