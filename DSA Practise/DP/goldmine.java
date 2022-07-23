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

        int[][] dir = {{0,1}, {-1,1}, {1,1}};

        int[][] dp = new int[n][m];
        for(int sc = m - 1; sc >= 0; sc--){
            for(int sr = n-1; sr >= 0; sr--){
                if(sc == m-1){
                    dp[sr][sc] = mine[sr][sc];
                    continue;
                }
                int max = Integer.MIN_VALUE;
                for(int d = 0; d < dir.length; d++){
                    int r = sr + dir[d][0];
                    int c = sc + dir[d][1];

                    if(r >= 0 && c >= 0 && r <= n-1 && c <= m-1){
                        max = Math.max(max, mine[sr][sc] + dp[r][c]);
                    }
                }
                dp[sr][sc] =  max;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, dp[i][0]);
        }
        System.out.println(max);
    }
}
