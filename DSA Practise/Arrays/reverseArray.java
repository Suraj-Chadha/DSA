package Arrays;
import java.util.*;
import java.io.*;
public class reverseArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    
      public static void reverse(int[] arr){
        for(int i = 0 ; i <= (arr.length - 1)/2; i++){
          int temp = arr[i];
          arr[i] = arr[arr.length - 1 - i];
          arr[arr.length - i - 1] = temp;
        }
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        reverse(a);
        display(a);
     }
}
