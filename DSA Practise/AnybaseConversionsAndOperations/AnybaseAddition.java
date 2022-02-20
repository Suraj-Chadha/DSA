// Anybase Addition
package AnybaseConversionsAndOperations;
import java.util.*;
public class AnybaseAddition {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int carry = 0;
        int p = 1;
        int ans = 0;
        while(num1 !=0 || num2 !=0 || carry != 0){
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int sum = d1 + d2 + carry ;
            ans += ( sum % b) * p;
            // System.out.print(ans + ", ");
            p = p * 10;
            carry = ( sum ) / b;
            num1/=10;
            num2/=10;
        }
        System.out.println(ans);
        scn.close();
    }
}
