package AnybaseConversionsAndOperations;
import java.util.*;
public class AnybaseSubstraction {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int borrow = 0, p = 1, ans = 0;
        while(num2 != 0){
            int d1 = num1%10;
            int d2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            int diff = d2 - d1 - borrow;
            
            if(diff < 0){
                borrow = 1;
                diff+=b;
            }else{
                borrow = 0;
            }
            ans += diff * p;
            p = p * 10;
        }
        System.out.println(ans);
        scn.close();
    }
}
