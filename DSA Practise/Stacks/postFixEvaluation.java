package Stacks;
import java.util.*;
import java.io.*;
public class postFixEvaluation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        EvaluateAndConversion(exp);
    }
    public static void EvaluateAndConversion(String exp){
        Stack<Integer> Val = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> in = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch>= '0' && ch <= '9'){
                Val.push(ch-48);
                pre.push("" + ch);
                in.push("" + ch);
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                operation(Val,in,pre,ch);
            }
        }
        System.out.println(Val.peek());
        System.out.println(in.peek());
        System.out.println(pre.peek());
    }
    public static void operation(Stack<Integer> Val, Stack<String> in, Stack<String> pre,char ch){
        int val2 = Val.pop();
        int val1 = Val.pop();
        String inval2 = in.pop();
        String inval1 = in.pop();
        in.push('('+inval1+ch+inval2+')');
        String preval2 = pre.pop();
        String preval1 = pre.pop();
        pre.push(ch+preval1+preval2);
        if(ch == '+'){    
            Val.push(val1 + val2);
        }else if(ch == '-'){    
            Val.push(val1 - val2);
        }else if(ch == '*'){    
            Val.push(val1 * val2);
        }else{
            Val.push(val1 / val2);
        }
    }
}
