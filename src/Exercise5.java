import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        char [] board = {'1','2','3','4','5','6','7','8','9'};
        createBoard(board);
        int counter = 0;
        boolean isAvailableSlot;
        int playerMove;
       do {
           do {
               playerMove = getMoveFromUser(counter);
               isAvailableSlot=isAvailable(board,playerMove);
               if (playerMove>9 || playerMove<1)
                   System.out.println("Error: The number is not within the boards boundaries, please try again");
           }while (!isAvailableSlot || (playerMove>9||playerMove<1));

        placeMove(board,playerMove,counter);
        createBoard(board);
        counter++;
    }while (counter<9 && checkWinner(board)!='X' && checkWinner(board)!='O');
        if (whatTurn(counter-1)!='-'){
        System.out.println();
        System.out.println("The winner is ("+whatTurn(counter-1)+") congrats");}
        else {
            System.out.println();
            System.out.println("It is a tie");
        }
    }
    public static void createBoard (char [] board){

        int boardPosition = 0;
        System.out.println("TIC-TAC-TOE");
        System.out.print("~~~~~~~");
        for (int i = 0; i<3 ; i++) {
            System.out.println();
            for (int j=0; j<3; j++){
                System.out.print("|"+board[boardPosition]);
                boardPosition++;
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.print("~~~~~~~");
    }
    public static boolean isAvailable (char [] board, int userMove)
    {
        boolean isAvailable= new String(board).indexOf('X') != userMove - 1 && new String(board).indexOf('O') != userMove - 1;
        if (!isAvailable) {
            System.out.println("Error: The slot is already occupied, try another one please by: "+board[userMove-1]);
        }
        return isAvailable;
    }
    public static int getMoveFromUser (int counter){
        Scanner scanner = new Scanner(System.in);
        int userMove;
            System.out.println();
            System.out.println("(~"+ whatTurn(counter) +"~)Where do you want to make your next move (1-9)");
            userMove= scanner.nextInt();

        return userMove;
    }
    public static void placeMove (char [] board, int userMove,int moveCounter){
        char turn = whatTurn(moveCounter);
        board[userMove-1]=turn;
    }
    public static char whatTurn (int moveCounter)
    {

        char turn = '-';
        if (moveCounter%2==1) {
            turn = 'O';
        }else if (moveCounter%2==0 && moveCounter!=8){
            turn = 'X';
        }
        return turn;
    }
    public static char checkWinner (char [] board){
        char winner='-';
        for (int i=0; i<board.length-2;i+=3)
        {
            if (board[i]=='X'&&board[i+1]=='X'&&board[i+2]=='X'){
                winner='X';}
            else if (board[i]=='O'&&board[i+1]=='O'&&board[i+2]=='O'){
                winner='O';}
        }
        for (int i = 0;i< board.length-6;i++)
        {
            if (board[i]=='X'&&board[i+3]=='X'&&board[i+6]=='X'){
                winner='X';}
            else if (board[i]=='O'&&board[i+3]=='O'&&board[i+6]=='O'){
                winner='O';}
        }
        if (board[0]=='X' && board [4]=='X' && board[8]=='X'){
            winner='X';
        }else if (board[2]=='X' && board [4]=='X' && board[6]=='X'){
            winner ='X';
        }
        if (board[0]=='O' && board [4]=='O' && board[8]=='O'){
            winner='O';
        }else if (board[2]=='O' && board [4]=='O' && board[6]=='O'){
            winner ='O';
        }
            return winner;
    }
}
