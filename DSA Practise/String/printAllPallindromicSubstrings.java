import java.util.*;
public class printAllPallindromicSubstrings {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }
    public static void solution(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                if(isPallindrome(str.substring(i,j+1))){
                    System.out.println(str.substring(i,j+1));
                }
            }
        }
    }
    public static boolean isPallindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
