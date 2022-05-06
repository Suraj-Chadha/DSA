package Stacks;
// import java.util.*;
import java.io.*;
public class celebrityProblemWithoutStack {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = str.charAt(j)-48;
            }
        }
        int c = findCelebrity(arr);
        if(c!=-1){
            System.out.println(c);
        }else{
            System.out.println("none");
        }
    }
    public static int findCelebrity(int[][] arr){
        int l = 0, r = arr.length-1;
        while(l < r){
            if(arr[l][r] == 1){
                l++;
            }else{
                r--;
            }
        }
        int c = l;
        // System.out.println(c);
        if(confirmCelebrity(arr,c)){
            return c;
        }else{
            return -1;
        }
    }
    public static boolean confirmCelebrity(int[][] arr, int c){
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            if(i != c){
                if(arr[i][c] == 0 || arr[c][i] == 1){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}
