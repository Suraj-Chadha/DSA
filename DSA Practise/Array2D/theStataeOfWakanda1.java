package Array2D;
import java.io.*;
import java.util.*;

public class theStataeOfWakanda1{
public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) throws Exception {
    // write your code here
    
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] mat = newMatrix(n,m);
    display(mat);
 }
 public static int[][] newMatrix(int n, int m){
    //  Scanner scn = new Scanner(System.in);
     int[][] mat = new int[n][m];
     for(int i = 0; i < n; i++){
         for(int j = 0; j < m; j++){
             mat[i][j] = scn.nextInt();
         }
     }
     return mat;
 }
 public static void display(int[][] mat){
    //  StringBuilder sb = new StringBuilder();
     for(int j = 0; j < mat[0].length; j++){
         if(j%2 == 0){
             for(int i = 0; i < mat.length; i++){
                //  sb.append(mat[i][j] + "\n");
                System.out.println(mat[i][j]);
             }
            //  System.out.println();
         }else{
            for(int i = mat.length - 1; i >= 0; i--){
                 System.out.println(mat[i][j]);
                //  sb.append(mat[i][j] + "\n");
             }
            //  System.out.println();
         }
     }
    //   System.out.println(sb);
 }

}