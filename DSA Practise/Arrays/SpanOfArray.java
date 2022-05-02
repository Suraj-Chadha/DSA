package Arrays;
// import java.util.*;
import java.io.*;
public class SpanOfArray {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        span(arr);
    }
    public static void span(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: arr){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.println(max-min);
    }
}
