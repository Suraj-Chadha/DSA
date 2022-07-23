package DP;
import java.util.*;
public class climebStairsMinMoves {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        Integer min = climbStairs_tabulation(n, arr); 
        System.out.println(min);
    }

    public static Integer climbStairs_tabulation(int n, int[] arr){
        Integer[] strg = new Integer[n+1];
        strg[n] = 0;
        for(int i = n-1; i >= 0; i--){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= arr[i]; j++){
                if(i + j <= n){
                    if(strg[i+j] != null && strg[i+j] < min){
                        min = strg[i+j];
                    }
                }
            }
            if(min != Integer.MAX_VALUE)
                strg[i] = min +1;
        }

        return strg[0];
    }
}
