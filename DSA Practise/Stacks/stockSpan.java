package Stacks;
import java.util.*;
import java.io.*;
public class stockSpan {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] ans = stockSpanCal(arr);
        display(ans);
    }
    public static int[] stockSpanCal(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = i+1;
            }else{
                ans[i] = i-st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static void display(int[] arr){
        StringBuilder str = new StringBuilder();
        for(int i: arr){
            str.append(i+"\n");
        }
        System.out.println(str);
    }
}
