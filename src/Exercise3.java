public class Exercise3 {
    public static void main(String[] args) {
        int[] useInput = {1, 2, 2, 3,3,1};
        int[] noDupsArray = returnArrayWithOutDups(useInput);
        for (int i = 0; i < noDupsArray.length; i++)
            System.out.print(noDupsArray[i] + ",");


    }

    public static int[] returnArrayWithOutDups(int[] useInput) {

        int [] tempArray = new int[useInput.length];
        int dupsCounter=0;
        for (int i = 0; i < useInput.length; i++) {
            for (int j = 0; j < i; j++) {
                if (useInput[i] == useInput[j]) {
                    tempArray[j] = useInput[i];
                    dupsCounter++;
                }
            }
        }
        int noDupsArrayIndex=0;
        int [] noDupsArray=new int [tempArray.length-dupsCounter];
        for (int i=0;i<tempArray.length;i++)
            if (tempArray[i]!=0) {
                noDupsArray[noDupsArrayIndex] = tempArray[i];
                noDupsArrayIndex++;
            }
   return noDupsArray; }
}
