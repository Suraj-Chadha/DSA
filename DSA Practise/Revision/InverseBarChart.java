package Revision;
import java.io.*;
public class InverseBarChart {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        printChart(arr);
    }
    public static void printChart(int[] arr){
        

        // int h = 1;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) count++;
        }
        while(count!=arr.length){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 0){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                    arr[i]--;
                    if(arr[i] == 0){
                        count++;
                    }
                }
            }
            System.out.println();
        }
    }
}
