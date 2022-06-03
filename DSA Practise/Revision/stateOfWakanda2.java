package Revision;
import java.util.*;
import java.io.*;
public class stateOfWakanda2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = Integer.parseInt(br.readLine());
            }
        }
        travellingPassenger(mat,n);
    }
    public static void travellingPassenger(int[][] mat, int n){
        for(int d = 0; d < n; d++){
            for(int i = 0, j = d;i < n && j < n; i++, j++ ){
                System.out.println(mat[i][j]);
            }
        }
    }
}
