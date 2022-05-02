package Stacks;
import java.util.*;
import java.io.*;
public class InfixConversionPractice {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        conversion(exp);
    }    
    public static void conversion(String exp){
        Stack<Character> opStack = new Stack<>();
        Stack<String> Pre = new Stack<>();
        Stack<String> Post = new Stack<>();

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                opStack.push(ch);
            }else if((ch>='a' && ch <='z') || (ch >='0' && ch <='9') || (ch>= 'A' && ch <= 'Z')){
                Pre.push(""+ ch);
                Post.push(""+ch);
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(opStack.size() > 0 && opStack.peek() != '(' && precedence(opStack.peek()) >= precedence(ch)){
                    Conversion(opStack, Pre, Post);
                }
                opStack.push(ch);
            }else if(ch == ')'){
                while(opStack.size() > 0 && opStack.peek()!= '('){
                    Conversion(opStack, Pre,Post);
                }
                opStack.pop();
            }
        }
        while(opStack.size() > 0){
            Conversion(opStack, Pre,Post);
        }
        System.out.println(Post.peek());
        System.out.println(Pre.peek());
    }
    public static void Conversion(Stack<Character> opStack, Stack<String> Pre, Stack<String> Post){
        char op = opStack.pop();
        String preval2 = Pre.pop();
        String preval1 = Pre.pop();
        String postval2 = Post.pop();
        String postval1 = Post.pop();
        Pre.push(op+preval1+preval2);
        Post.push(postval1+postval2+op);
    }
    public static int precedence(char op){
        if(op == '+' || op == '-'){
            return 1;
        }else{
            return 2;
        }
    }
}
