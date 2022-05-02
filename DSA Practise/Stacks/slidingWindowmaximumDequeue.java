package Stacks;
import java.util.*;
import java.io.*;
public class slidingWindowmaximumDequeue {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        displayMaxWindow(arr,k);
    }
    public static void displayMaxWindow(int[] arr, int k){
        Deque<Integer> dq = new ArrayDeque<>(); // using Data Structure Deque
        for(int i = 0; i < k; i++){ // making answer for 1st k elements
            while(dq.size() > 0 && arr[i] > arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(dq.getFirst()); // answer for 1st window
        for(int i = k; i < arr.length; i++){ // now make answers for all other windows
            while(dq.size() > 0 && arr[i] > arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(dq.getFirst() <= i-k){
                dq.removeFirst();
            }
            System.out.println(dq.getFirst());
        }
    }
}
