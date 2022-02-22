package Arrays;
import java.util.*;
public class AnybaseMultiplication {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int p1 = 1;
        int ans1 = 0;
        int num2 = n2;
        while(n1!=0){
            int d1 = n1%10;
            int ans2 = 0;
            int carry = 0;
            int p2 = 1;
            num2 = n2;
            while(num2!=0 || carry !=0){
                int d2 = num2%10;
                int prod = d1*d2 + carry;
                carry = prod / b;
                prod = prod % b;
                ans2 += prod * p2;
                p2*=10; 
                num2/=10;
                // System.out.println("test internal==========>" + ans2);
            }
            n1/=10;
            // System.out.print("ans2 + " + ans2 + "ans1 " + ans1+ "= ");
            ans1 = sumAnybase(b,ans1, ans2*p1);
            // System.out.println(ans1);
            p1*=10;
        }
        System.out.println(ans1);
        scn.close();
    }
    public static int sumAnybase(int b, int n1, int n2){
        int ans = 0;
        int carry = 0;
        int p = 1;
        while(n1 > 0 || n2 > 0 || carry > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int sum = d1 + d2 + carry;
            carry = sum / b;
            sum = sum % b;
            ans = ans + sum * p;
            p = p * 10;
            n1 /= 10;
            n2/=10;
        }
        return ans;
    }
}
