//toggle case
import java.util.*;
public class toggleCase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String S2 = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                S2+= (char)(ch + 'A' - 'a');
            }else if(ch >= 'A' && ch <= 'Z'){
                S2+= (char)(ch - 'A' + 'a');
            }else{
                S2+= ch;
            }
        }
        System.out.println(S2);
    }
}
