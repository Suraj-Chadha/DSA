package SearchAlgorithms.BinarySearch;
import java.io.*;
import java.util.*;

public class LastIndexFirstIndex {


public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = Integer.parseInt(br.readLine());
    }
    for(int i: arr){
        System.out.println(i);
    }
    int d = Integer.parseInt(br.readLine());
    int fi = fidx(arr,d);
    int li = lidx(arr,d);
    System.out.println(fi+"\n"+li);
 }
 public static int fidx(int[] arr, int d){
    //  System.out.println(d);
     int lo = 0;
     int hi = arr.length-1;
     int ans = -1;
     while(lo < hi){
         int mid = lo+(hi-lo)/2;
         if(arr[mid] < d){
             lo = mid+1;
         }else if(arr[mid] > d){
             hi = mid-1;
         }else{
             ans = mid;
             hi = mid-1;
         }
     }
     return ans;
 }
  public static int lidx(int[] arr, int d){
     int lo = 0;
     int hi = arr.length-1;
     int ans = -1;
     while(lo < hi){
         int mid = lo+(hi-lo)/2;
         if(arr[mid] < d){
             lo = mid+1;
         }else if(arr[mid] > d){
             hi = mid-1;
         }else{
             ans = mid;
            //  hi = mid-1;
            lo = mid+1;
         }
     }
     return ans;
 }
 
}
