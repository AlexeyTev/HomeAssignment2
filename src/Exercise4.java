public class Exercise4 {
    public static void main(String[] args) {
        int [] userInput = {1,2,3,4,5,6,7,8,3,2,1};
        System.out.println(returnPeakValue(userInput));
    }
    public static int returnPeakValue (int [] userInput)
    {
        int peakValue = -1;
        int i =0;
        do {i++;
        }while (userInput[i]<userInput[i+1] && i<userInput.length-1);

        int j= userInput.length-1;
        do {j--;

        }while (userInput[j]<userInput[j-1] && j>i);
        if (j==i)
            peakValue=i;
        return peakValue;
    }
}
