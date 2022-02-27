package Arrays;
import java.util.*;
public class DifferenceOf2Arrays {
    public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) throws Exception {
    
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    TakeInput(arr1);
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    int[] arr3 = new int[n2];
    TakeInput(arr2);
    int borrow = 0;

    // int p = 1;
    // int ans = 0;
    int i = n2 - 1;
    int j = n1 - 1;
    int k = n2 - 1;
    while(k >= 0){
        int diff = arr2[i] - borrow;
        if(j >= 0){
            diff -= arr1[j];
            j--;
        }

        if(diff < 0){
            borrow = 1;
            diff += 10;
        }
        else{
            borrow = 0;
        }
        arr3[k] = diff;
        k--;
        i--;
        // ans += diff*p;
        // p *= 10;
    }
    Display(arr3);
    
 }
 public static void TakeInput(int[] arr){
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
 }
 public static void Display(int[] arr){
     int i = 0;
     while(arr[i] == 0){
         i++;
     }
     for(; i < arr.length; i++){
         System.out.println(arr[i]);
     }
 }
}
