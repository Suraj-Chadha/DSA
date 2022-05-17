package Recursion;
import java.util.*;
public class reverseStackRecursion {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
       
        reverseStack(st,"");
        while(st.size() > 0){
            System.out.println(st.pop());
        }
        
    }
    public static String reverseStack(Stack<Character>st,String str){
        if(st.size() == 0) return str;
        char ch = st.pop();
        String ans = reverseStack(st,str+ch);
        char ch1 = ans.charAt(0);
        ans = ans.substring(1);
        st.push(ch1);
        return ans;
    }
}
