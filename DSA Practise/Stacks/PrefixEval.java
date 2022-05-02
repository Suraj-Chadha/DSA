package Stacks;
import java.util.*;
import java.io.*;
public class PrefixEval {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        EvaluateAndConversion(exp);
    }
    public static void EvaluateAndConversion(String exp){
        Stack<Integer> Val = new Stack<>();
        Stack<String> Post = new Stack<>();
        Stack<String> In = new Stack<>();

        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);
            if(ch >= '0' && ch <= '9'){
                Val.push(ch-48);
                Post.push(ch+"");
                In.push(ch+"");
            }else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                Operation(Val,Post,In,ch);
            }
        }   
        System.out.println(Val.peek());
        System.out.println(In.peek());
        System.out.println(Post.peek());
    }
    public static void Operation(Stack<Integer> Val, Stack<String> Post, Stack<String> In, char op){
        int val1 = Val.pop();
        int val2 = Val.pop();
        String postVal1 = Post.pop();
        String postVal2 = Post.pop();
        String inVal1 = In.pop();
        String inVal2 = In.pop();
        int res = calc(val1, val2, op);
        Val.push(res);
        Post.push(postVal1+postVal2+op);
        In.push('('+inVal1+op+inVal2+')');
    }
    public static int calc(int val1, int val2, char op){
        if(op == '+'){
            return val1+val2;
        }else if(op == '-'){
            return val1-val2;
        }else if(op == '*'){
            return val1*val2;
        }else{
            return val1/val2;
        }
    }
}
