package DP;
import java.util.*;
public class goldmine {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mine = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mine[i][j] = scn.nextInt();
            }
        }

        int[][] strg = new int[n][m];
        for(int i = m - 1; i >= 0; i--){
            for(int j = 0; j <= n-1; j++){
                if(i == m-1){
                    strg[j][i] = mine[j][i];
                }else if(j == 0){
                    strg[j][i] = mine[j][i] + Math.max(strg[j][i+1], strg[j+1][i+1]);
                }else if(j == n-1){
                    strg[j][i] = mine[j][i] + Math.max(strg[j][i+1], strg[j-1][i+1]);
                }else{
                    strg[j][i] = mine[j][i] + Math.max(strg[j+1][i+1] ,Math.max(strg[j][i+1], strg[j-1][i+1]));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, strg[i][0]);
        }
        System.out.println(max);
    }
}
