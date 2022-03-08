package Arrays;
import java.util.*;
public class reverseBarChart {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        PrintbarChart(arr);
    }
    public static void PrintbarChart(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 1; i <= max; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] >= i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
