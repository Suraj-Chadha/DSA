package Arrays;
import java.util.*;
public class PrintBarChartArray {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int max = Integer.MIN_VALUE;
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
        if(arr[i] > max){
            max = arr[i];
        }
    }
    PrintBarChart(arr, max);
    scn.close();
}
public static void PrintBarChart(int[] arr, int max){
    for(int height = max; height > 0; height--){
        for(int i = 0; i < arr.length; i++){
            if(height <= arr[i]){
                System.out.print("*\t");
            }
            else{
                System.out.print(" \t");
            }
        }
        System.out.println();
    }
}
}
