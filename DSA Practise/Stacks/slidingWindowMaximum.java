package Stacks;
import java.util.*;
import java.io.*;
public class slidingWindowMaximum{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        int ans[] = NGETR(arr);
        for(int i = 0; i <= ans.length-k; i++){
            int j = i;
            while(j < i+k){
                if(ans[j] < j){
                    j = ans[j];
                }
            }
            System.out.println(arr[j]);
        }
    }
    public static int[] NGETR(int[] arr){
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
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