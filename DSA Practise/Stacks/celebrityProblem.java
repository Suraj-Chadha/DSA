// TC = O(n)
// Space Complexity = O(N);
// Solve it without using any stack
package Stacks;
import java.util.*;
import java.io.*;
public class celebrityProblem {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0;j < n; j++){
                arr[i][j] = str.charAt(j) - 48;
            }
        }
        int c = findCelebrity(arr);
        if(c!= -1){
            System.out.println(c);
        }else{
            System.out.println("none");
        }
    }
    public static int findCelebrity(int[][] arr){
        Stack<Integer> st = new Stack<>(); // O(n) --> space complexity
        //push all the people in the stack 
        for(int i = 0;i < arr.length; i++){
            st.push(i);
        }
        //pop 2 elements and Eliminate one of them based on the conditions given and push the other one back in
        while(st.size() != 1){ // O(3n-3)
            int p1 = st.pop();
            int p2 = st.pop();
            if(arr[p1][p2] == 1){
                st.push(p2);
            }else{
                st.push(p1);
            }
        }
        // now once we have our only possible person to be a celebrity we will confirm if he is actually a celebrity or not

        if(confirmCelebrity(arr,st.peek())){
            return st.pop();
        }else{
            return -1;
        }
    }
    public static boolean confirmCelebrity(int[][] arr, int c){
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){ // O(n)
            if(i != c){
                if(arr[c][i] == 1 || arr[i][c] == 0){
                    flag = false;
                    break;
                } 
            }
        }
        return flag;
    }

}
