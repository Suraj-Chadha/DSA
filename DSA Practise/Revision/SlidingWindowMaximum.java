package Revision;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class SlidingWindowMaximum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k  =Integer.parseInt(br.readLine());
        maximumInWindow(arr,k);
    }
    public static void maximumInWindow(int[] arr, int k){
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            
            while(dq.size() > 0 && arr[dq.peek()] < arr[i]){
                dq.pop();
            }
            dq.push(i);
        }
        System.out.println(arr[dq.getFirst()]);

        for(int i = k; i < arr.length; i++){

            while(dq.size() > 0 && arr[i] > arr[dq.peek()]){
                dq.pop();
            }
            dq.push(i);
            if(dq.getFirst() <= i-k){
                dq.removeFirst();
            }
            System.out.println(arr[dq.getFirst()]);
        }
    }
}
