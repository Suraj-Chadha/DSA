import java.io.*;
import java.util.*;

public class knightsTour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        int[][] chess = new int[n][n];

        printKnightsTour(chess,sr,sc,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(r < 0 || r >= chess.length || c < 0 || c >= chess[0].length || chess[r][c] != 0){
            return;
        }
        if(upcomingMove == chess.length * chess[0].length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
        }
        chess[r][c] = upcomingMove;
        printKnightsTour(chess,r-2,c+1,upcomingMove+1);
        printKnightsTour(chess,r-1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+2,c+1,upcomingMove+1);
        printKnightsTour(chess,r+2,c-1,upcomingMove+1);
        printKnightsTour(chess,r+1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-2,c-1,upcomingMove+1);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}