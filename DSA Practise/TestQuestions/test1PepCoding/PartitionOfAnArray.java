package TestQuestions.test1PepCoding;
import java.util.*;
public class PartitionOfAnArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(mid <= high){
            if(arr[mid] < pivot){
                Swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid] > pivot){
                Swap(arr,mid,high);
                high--;
            }else{
                mid++;
            }
        }
        Display(arr);
        scn.close();
    }
    public static void Swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void Display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
