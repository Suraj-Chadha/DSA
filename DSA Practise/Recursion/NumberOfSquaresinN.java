package Recursion;
import java.util.*;
public class NumberOfSquaresinN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = NumberOfSquares(n);
        System.out.println(ans);
    }
    public static int NumberOfSquares(int n){
        //base case
        if(n == 0) return 0;
        // faith
        int rres = NumberOfSquares(n-1);
        // mywork
        int ans = n*n+rres;
        return ans;
    }
}
