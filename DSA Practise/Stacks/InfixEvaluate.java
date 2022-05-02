package Stacks;
import java.util.*;
import java.io.*;
public class InfixEvaluate {
    public static void main(String[] args)throws Exception{
        // Scanner scn = new Scanner(System.in);
        // String str = scn.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int ans = eval(str);
        System.out.println(ans);
        // scn.close();
    }
    public static int eval(String str){
        Stack<Character> st = new Stack<>();
        Stack<Integer> stVal = new Stack<>();
        // int res;
        for(int j = 0; j < str.length(); j++){
            char i = str.charAt(j);
            if(i>='0' && i <='9'){
                stVal.push(i-48);
            }
            if(i == '+' || i == '-' ||  i == '/' ||i == '*'){
                while(st.size() > 0 && st.peek()!='(' && percedence(i)<=percedence(st.peek())){
                    doinfixEvaluation(st,stVal);
                }
                st.push(i);
                  
            }else if(i == '('){
                st.push(i);

            }else if(i == ')'){
                while(st.size() > 0 && st.peek()!='('){
                    doinfixEvaluation(st,stVal);
                }
                st.pop();
            }
        }
        while(st.size() > 0){
            doinfixEvaluation(st,stVal);
        }
        return stVal.peek();
    }
    public static void doinfixEvaluation(Stack<Character> st, Stack<Integer> stVal){
        char op = st.pop();
           int res = Opearte(stVal.pop(), stVal.pop(),op);
            stVal.push(res);
    }
    public static int percedence(char ch){
        if(ch == '+'){
           return 1;
        }
        else if(ch == '-'){
           return 1;
        }
        else if(ch == '*'){
            return 2;
        }
        else{
            return 2;
        }
    }
    public static int Opearte(int val2, int val1 , char ch){
        if(ch == '+'){
            return val1+val2;
        }else if(ch == '-'){
            return val1-val2;
        }else if(ch == '/'){
            return val1/val2;
        }else{
            return val1*val2;
        }
    }
}
