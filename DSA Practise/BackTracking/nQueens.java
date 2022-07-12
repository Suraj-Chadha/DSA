import java.util.*;
public class nQueens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        findCombination(chess,"", 0);
    }
    public static void findCombination(int[][] chess, String psf, int row){
        if(row == chess.length){
            System.out.println(psf+".");
        }
        for(int i = 0; i < chess[0].length; i++){
            if(queenIsSafe(chess,row,i)){
                chess[row][i] = 1;
                findCombination(chess, psf+row+"-"+ i + ", ", row+1);
                chess[row][i] = 0;
            }            
        }
    }
    public static boolean queenIsSafe(int[][] chess, int i, int j){
        // left diagonal
        for(int r = i - 1, c = j - 1; r >= 0 && c >= 0; r--, c--){
            if(chess[r][c] == 1) return false;
        }
        // straight up
        for(int r = i-1; r >= 0; r--){
            if(chess[r][j] == 1) return false;
        }
        // right diagonal
        for(int r = i-1, c = j+1; r >= 0 && c < chess[0].length; r--,c++){
            if(chess[r][c] == 1) return false;
        }
        return true;
    }
}

// op for n = 4
// 0-1, 1-3, 2-0, 3-2, .
// 0-2, 1-0, 2-3, 3-1, .