package DP;

import java.io.*;
import java.util.*;

public class minimumCostInMazeTraversal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int[][] strg = new int[n][m];
        int min = mazeTraverse_tabulation(mat, strg, n, m);
        // int min = mazetraversal_memoization(mat, strg, n-1, m-1);
        System.out.println(min);
    }

    public static int mazeTraverse_tabulation(int[][] mat, int[][] strg, int n, int m) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    strg[i][j] = mat[i][j];
                } else if (i == n - 1) {
                    strg[i][j] = mat[i][j] + strg[i][j + 1];
                } else if (j == m - 1) {
                    strg[i][j] = mat[i][j] + strg[i + 1][j];
                } else {
                    strg[i][j] = mat[i][j] + Math.min(strg[i + 1][j], strg[i][j + 1]);
                }
            }
        }
        return strg[0][0];
    }

    // public static int mazetraversal_memoization(int[][] mat, int[][] strg, int n, int m){

    //     int c = mat[n][m];
        
    //     mazetraversal_memoization(mat, strg, n-1, m);
    //     mazetraversal_memoization(mat, strg, n, m-1);

    // }
}