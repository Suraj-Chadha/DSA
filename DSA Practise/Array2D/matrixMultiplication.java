package Array2D;
import java.io.*;
import java.util.*;

public class matrixMultiplication {
public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] mat1 = newMatrix(n1,m1);
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] mat2 = newMatrix(n2,m2);

    int[][] resMatrix = matrixMulti(mat1,mat2);
    if(resMatrix == null){
        System.out.println("Invalid input");
        return;
    }
    display(resMatrix);
    
 }


 public static int[][] newMatrix(int n1, int m1) throws Exception{
  
    int[][] mat1 = new int[n1][m1];
    for(int i = 0; i < n1; i++){
        for(int j = 0; j < m1; j++){
            mat1[i][j] = scn.nextInt();
        }
    }
    return mat1;
 }

 public static int[][] matrixMulti(int[][] mat1, int[][] mat2){
     if(mat1[0].length != mat2.length) return null;

     int[][] mat3 = new int[mat1.length][mat2[0].length];
     for(int i = 0; i < mat1.length; i++){
         for(int j = 0; j < mat2[0].length; j++){
             int res = 0;
             for(int k = 0; k < mat2.length; k++){
                 res+=mat1[i][k]*mat2[k][j];
             }
            mat3[i][j] = res;
         }
     }
     return mat3;
 }
 public static void display(int[][] resMatrix){
     for(int i = 0; i < resMatrix.length; i++){
         for(int j = 0; j < resMatrix[0].length; j++){
             System.out.print(resMatrix[i][j]+" ");
         }
         System.out.println();
     }
 }

}