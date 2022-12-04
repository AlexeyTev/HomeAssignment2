import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
printNumBiggerTheAvgFromInput();
    }
    public static void printNumBiggerTheAvgFromInput ()
    {
        Scanner scanner = new Scanner(System.in);
        int [] userInputNumbers = new int[10];
        float arrayAvg=0;
        for (int i=0; i< userInputNumbers.length; i++)
        {
            userInputNumbers[i]= scanner.nextInt();
            arrayAvg+=userInputNumbers[i];
        }
        arrayAvg/= userInputNumbers.length;
        for (int i=0; i< userInputNumbers.length;i++) {
            if (userInputNumbers[i]>arrayAvg)
                System.out.println(userInputNumbers[i]);
        }



    }
}
