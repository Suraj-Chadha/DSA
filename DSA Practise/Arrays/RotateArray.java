// Main Concept : To Rotate an Array by k ---> Try reversing array 3 times , 2 times around k as a pivot and one as a whole


package Arrays;
import java.io.*;
// import java.util.*;
public class RotateArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
      public static void reverse(int[] a,int left, int right){
        while(left < right){
          int temp = a[left];
          a[left] = a[right];
          a[right] = temp;
          left++;
          right--;
        }
      }
      public static void rotate(int[] a, int k){
        int n = a.length;
        k = k % n;
        if(k < 0){
          k = k + n;
        }
        reverse(a,n-k,n-1);
        reverse(a,0,n-k-1);
        reverse(a,0,n-1);
    
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
    
        rotate(a, k);
        display(a);
     }
}
