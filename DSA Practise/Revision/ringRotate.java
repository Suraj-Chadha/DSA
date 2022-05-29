package Revision;
import java.io.*;
import java.util.*;
public class ringRotate {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = Integer.parseInt(br.readLine());
            }
        }
        int s = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int[] arr = getArr(mat,s);
        // for(int i: arr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        RotateArr(arr,r);
        rotateRing(mat,arr,s);
        display(mat);
    }
    public static void RotateArr(int[] arr, int r){
        r = r % arr.length;
        if(r > 0){
            r = arr.length - r;
        }else{
            r = -r;
        }
        reverse(arr,arr.length-r,arr.length-1);
        reverse(arr,0,arr.length-r-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr, int i, int j){
        int l = i;
        int r = j;
        while( l < r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
    public static int[] getArr(int[][] mat, int s){
        int l = s-1;
        int r = mat[0].length-s;
        int t = s-1;
        int b = mat.length-s;
        int len = 2*(r - l + b - t);
        int[] arr = new int[len];
        int c = 0;
        for(int i = l ; i <= r; i++){
            arr[c++] = mat[t][i];
        }
        t++;
        for(int i = t ; i <= b; i++){
            arr[c++] = mat[i][r];
        }
        r--;
        for(int i = r ; i >= l; i--){
            arr[c++] = mat[b][i];
        }
        b--;
        for(int i = b ; i >= t; i--){
            arr[c++] = mat[i][l];
        }
        l++;
        return arr;
        
        
    }
    public static void rotateRing(int[][] mat, int[] arr, int s){
        int l = s-1;
        int r = mat[0].length-s;
        int t = s-1;
        int b = mat.length-s;
        int c = 0;
        for(int i = l ; i <= r; i++){
           mat[t][i] = arr[c++];
        }
        t++;
        for(int i = t ; i <= b; i++){
          mat[i][r] = arr[c++];
        }
        r--;
        for(int i = r ; i >= l; i--){
           mat[b][i] = arr[c++];
        }
        b--;
        for(int i = b ; i >= t; i--){
           mat[i][l] = arr[c++];
        }
        l++;
       

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