package String;
import java.util.*;
public class ReverseStringRecursion{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = reverse(str);
        System.out.println(ans);
        scn.close();
    }
        public static String reverse(String str) {
            if(str.length() == 0){
                return "";
            }
            char ch = str.charAt(str.length() - 1);
            String ros = str.substring(0,str.length()-1);
            String rstr = reverse(ros);
            String ans = ch+rstr;
            return ans;
        }
}