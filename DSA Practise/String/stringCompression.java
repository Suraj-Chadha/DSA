import java.util.*;
public class stringCompression {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        System.out.println(str);
        scn.close();
    }
    public static String compression1(String str){
        String compress = "" + str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != compress.charAt(compress.length()-1)){
                compress+=str.charAt(i);
            }
        }
        return compress;
    }
    public static String compression2(String str){
        String compress = "" + str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != compress.charAt(compress.length()-1)){
                if(count > 1){
                    compress += count;
                }
                compress += str.charAt(i);
                count = 1;
            }else{
                count++;
            }
        }
        if(count > 1){
            compress+=count;
        }
        return compress;
    }
}
