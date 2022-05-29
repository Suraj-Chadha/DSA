package Revision;
import java.io.*;
import java.util.*;

public class Rotate90degree {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// size of matrix n * n
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        display(arr);
        System.out.println();
        transpose(arr);
        display(arr);
        System.out.println();
        reverse(arr);
        display(arr);
    }
    public static void transpose(int[][] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] arr){
        int l = 0, r = arr[0].length - 1;
        while(l < r){
            for(int i = 0; i < arr.length; i++){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
            }
            l++;
            r--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}