import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Com extends Board{
    static Scanner sc=new Scanner(System.in);
    static Board bd= new Board();
    static String[][] board= bd.board;
    static int[] position;

    public static void comTurn(){
        minimax(bd,0,true);
        if(emptySpot(position[0],position[1])) {
            board[position[0]][position[1]] = "  O  ";
        }
    }
    public static int minimax(Board bd, int depth, boolean max) {   // minimax algorithm for computer and player
        int[][] possibleMoves = getPossibleMoves(bd);
        if (tie(bd.board)) {
            return 0;
        }
        else if (userWin(bd.board)) {
            return depth - 10;
        }
        else if (compWin(bd.board)) {
            return 10 - depth;
        }

        double highestScore;
        if (max) {          // achieve the least score
            highestScore = Double.NEGATIVE_INFINITY;
            for (int[] move: possibleMoves) {

                Board modified = new Board();

                for (int i = 0; i < bd.board.length; i++)
                    System.arraycopy(bd.board[i], 0, modified.board[i], 0, bd.board[0].length);

                modified.board[move[0]][move[1]] = "  O  ";

                int score = minimax(modified, depth++, false);

                if (score > highestScore) {
                    highestScore = score;
                    position = move;
                }
                if (userWin(modified.board)) {
                    position = move;
                    break;
                }
                else if (compWin(modified.board)) {
                    position = move;
                    break;
                }
            }
        }
        else {          //achieve the highest score
            highestScore = Double.POSITIVE_INFINITY;
            for (int[] move: possibleMoves) {

                Board modified = new Board();

                for (int i = 0; i < bd.board.length; i++)
                    System.arraycopy(bd.board[i], 0, modified.board[i], 0, bd.board[0].length);

                modified.board[move[0]][move[1]] = "  X  ";

                int score = minimax(modified, depth++, true);

                if (score < highestScore) {
                    highestScore = score;
                    position = move;
                }
                if (userWin(modified.board)) {
                    position = move;
                    break;
                }
                else if (compWin(modified.board)) {
                    position = move;
                    break;
                }
            }
        }
        return (int) highestScore;
    }
    public static int[][] getPossibleMoves(Board bd) { // return moves
        ArrayList<int[]> moves = new ArrayList<>();
        for (int i = 0; i < bd.board.length; i+=2) {
            for (int j = 0; j < bd.board[0].length; j+=2) {
                if (bd.board[i][j].contains("     ")) {
                    int[] place = {i,j};
                    moves.add(place);
                }
            }
        }
        int[][] possibleMoves = new int[moves.size()][2];
        for (int i = 0; i < moves.size(); i++) {
            possibleMoves[i] = moves.get(i);
        }
        return possibleMoves;
    }
    public static boolean emptySpot(int x, int y) {     //check empty spot
        return !board[x][y].equals("  X  ") && !board[x][y].equals("  O  ");
    }
    public static boolean updateBoard(int x, int y) { //draw X on empty spot
        if (emptySpot(x, y)) {
            board[x][y] = "  X  ";
            return true;
        }
        return false;
    }
    public static void userTurn() { //user input coordinates
        try {
            System.out.print("\nEnter X, Y coordinates for your move separated by a space: ");
            int y = 2*sc.nextInt() - 2;
            int x = 2*sc.nextInt() - 2;
            userAction(x, y);
        }
        catch (InputMismatchException e) {
            System.out.println("\nPlease enter only integer values.");
            sc.nextLine();
            userTurn();
        }
    }
    public static void userAction(int x, int y) {
        if (!updateBoard(x, y)) {
            System.out.print("\nPlease enter your coordinates again.\n");
            userTurn();
        }
    }
    public static boolean compWin(String[][] board) {
        for (int i = 0; i < 5; i += 2) { // checks horizontals and verticals
            if (board[i][0].equals(board[i][2]) && board[i][0].equals(board[i][4])) {
                if (board[i][0].contains("O")) {
                    return true;
                }
            }
            if (board[0][i].equals(board[2][i]) && board[0][i].equals(board[4][i])) {
                if (board[0][i].contains("O")) {
                    return true;
                }
            }
        }
        if ((board[0][0].equals(board[2][2]) && board[0][0].equals(board[4][4]))) { // checks diagonals
            return board[0][0].contains("O");
        }
        else if ((board[0][4].equals(board[2][2]) && board[0][4].equals(board[4][0]))) {
            return board[0][4].contains("O");
        }
        return false;
    }

    public static boolean userWin(String[][] board) {
        for (int i = 0; i < 5; i += 2) {
            if (board[i][0].equals(board[i][2]) && board[i][0].equals(board[i][4])) {
                if (board[i][0].contains("X")) {
                    return true;
                }
            }
            if (board[0][i].equals(board[2][i]) && board[0][i].equals(board[4][i])) {
                if (board[0][i].contains("X")) {
                    return true;
                }
            }
        }
        if ((board[0][0].equals(board[2][2]) && board[0][0].equals(board[4][4]))) {
            return board[0][0].contains("X");
        }
        else if ((board[0][4].equals(board[2][2]) && board[0][4].equals(board[4][0]))) {
            return board[0][4].contains("X");
        }
        return false;
    }
    public static boolean tie(String[][] bd) { // checks tie
        for (int i = 0; i < 5; i += 2) {
            for (int j = 0; j < 5; j += 2) {
                if (bd[i][j].equals("     "))
                    return false;
                if (bd[j][i].equals("     "))
                    return false;
            }
        }
        return true;
    }

}
