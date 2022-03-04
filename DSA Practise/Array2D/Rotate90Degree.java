package Array2D;
import java.util.*;
public class Rotate90Degree{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        //int n = scn.nextInt();
        int[][] arr = new int[m][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        Display(arr);
    Transpose(arr);
        Display(arr);
        RotateArr(arr);
        Display(arr);
        scn.close();
    }
    public static void RotateArr(int[][]arr){
        int left = 0;
        int right = arr.length - 1;
        while( left < right){
            for(int i = 0; i < arr.length ; i++){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }
    }
    public static void Transpose(int[][] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr[i].length; j++){
                if(i != j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp; 
                }
            }
        }
       // return arr;
    }
    public static void Display(int[][] arr){
        for(int i = 0;i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}