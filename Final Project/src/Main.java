import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(2)+1;
        System.out.println("""
                Enter your move with XY coordinates. Your input should be two integers separated by a space.
                You are X and computer is O""");
        Com.bd.printBoard();
        for (int i = 0; i < 5; i += 2) {
            for (int j = 0; j < 5; j += 2) {
                Com.board[i][j] = "     ";
            }
        }
        if(num == 1) {      // player moves first
            System.out.println("player moves first");
            while (!Com.userWin(Com.bd.board) && !Com.compWin(Com.bd.board)) { // keeps going until either one wins
                if (Com.tie(Com.board)) break;
                Com.userTurn();
                Com.comTurn();
                Com.bd.printBoard();
                if (Com.compWin(Com.bd.board)) { System.out.println("\nYou lost!\n");}
                if (Com.userWin(Com.bd.board)) { System.out.println("\nGood job. You won!!\n");}
            }
        }
        else{               //computer moves first
            System.out.println("computer moves first");
            while (!Com.compWin(Com.bd.board) && !Com.userWin(Com.bd.board)) { // keeps going until either one wins
                if (Com.tie(Com.board)) break;
                Com.comTurn();
                Com.bd.printBoard();
                if(!Com.compWin(Com.bd.board)) {
                    Com.userTurn();
                }
                else if (Com.compWin(Com.bd.board)) { System.out.println("\nYou lost!\n");}
                if (Com.userWin(Com.bd.board)) {
                    Com.bd.printBoard();
                    System.out.println("\nGood job. You won!!\n");
                }
            }
        }
    }
}
