package Recursion;
import java.util.*;
public class getKPC {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        // str="";
        ArrayList<String> words = getkpc(str);
        // System.out.println(words.size());
        System.out.println(words);
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    //345
    public static ArrayList<String> getkpc(String str){
        if(str.equals("")){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); //"345" ---> '3'
        String ros = str.substring(1); //"345" ---> "45"
        ArrayList<String> rres = getkpc(ros); // [jm,jn,jo,km,kn,ko,lm,ln,lo]
        ArrayList<String> myres = new ArrayList<>();// myres = []
        String code = codes[ch-48]; // ascii of '0' is 48, to convert any character to number
        //code ---> g h i
        for(int i = 0; i < code.length(); i++){ // g h i
            char chi = code.charAt(i);
            for(String rstr: rres){ // [jm,jn,jo,km,kn,ko,lm,ln,lo]
                myres.add(chi+rstr);
            }
        }

        return myres;
    }
}
