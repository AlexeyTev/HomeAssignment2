import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String equation= scanner.nextLine();
       if (isValidEquation(equation)) {
           int aPart = valueOfA(equation);
           int bPart = valueOfB(equation);
           int cPart = valueOfC(equation);
           System.out.println("a: " + aPart + " b:" + bPart + " c:" + cPart);
           Double[] solution = solutionOfEquation(aPart, bPart, cPart);
           System.out.println("x1=" + solution[0] + ", x2=" + solution[1]);
       }else System.out.println("You entered invalid equation!");
    }
    public static boolean isValidEquation (String userEquation) {
        boolean isValid=true;

        return isValid;
    }
        public static int valueOfA (String equation)
    {
        int aValue;
        if (equation.startsWith("-x")) {
           aValue=-1;
        } else if (equation.startsWith("x")) {
            aValue=1;
        }else {
                String aPart = equation.substring(0, equation.indexOf("^2") - 1);
                aValue = Integer.parseInt(aPart);}

        return aValue;

    }
    public static int valueOfB (String equation)
    {
        int bValue;
        String bPart = equation.substring(equation.indexOf("^2")+2,equation.indexOf("x+"));
        if (bPart.startsWith("x"))
        {
            bValue=1;
        }else {
            bValue = Integer.parseInt(bPart);
        }
        return bValue;

    }
    public static int valueOfC (String equation)
    {
        int cValue;
        String bPart = equation.substring(equation.indexOf("^2")+2,equation.indexOf("x+"));
        String cPart = equation.substring(equation.indexOf(bPart)+3,equation.indexOf("="));
        if (cPart.contains("-")){
            cValue = Integer.parseInt(cPart) * -1;}
        else cValue = Integer.parseInt(cPart);

        return cValue;

    }
    public static Double [] solutionOfEquation (int a, int b, int c){
        Double [] solution = new Double [2];
        int sqrt = (b*b)-(4*a*c);
        int divide = 2*a;
        solution[0]=(-b+(Math.sqrt(sqrt)))/divide;
        solution[1]=(-b-(Math.sqrt(sqrt)))/divide;
        return solution;
    }

}
