package Stacks;

import java.util.*;

public class balancedBrackets{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        Stack<Character> st = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if(ch == ')'){
                    if(!isBalanced(st,'(')){
                        System.out.println("false");
                        return;
                    }
                    st.pop();
                }else if(ch == ']'){
                    if(!isBalanced(st,'[')){
                        System.out.println("false");
                        return;
                    }
                    st.pop();
                }else if(ch == '}'){
                    if(!isBalanced(st,'{')){
                        System.out.println("false");
                        return;
                    }
                    st.pop();
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scn.close();
    }
    public static boolean isBalanced(Stack<Character> st, char bracket){
        if(st.size() == 0){
            return false;
        }
        if(st.peek() == bracket){
            return true;
        }
        return false;
    }
}