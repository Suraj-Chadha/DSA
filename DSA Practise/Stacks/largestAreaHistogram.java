package Stacks;
import java.util.*;
import java.io.*;
public class largestAreaHistogram{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] lb = NSITL(arr);
        int[] rb = NSITR(arr);
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            maxArea = Math.max(maxArea,arr[i]*(rb[i] - lb[i] -1));
        }
        System.out.println(maxArea);
    }

    public static int[] NSITL(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] NSITR(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = arr.length;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}