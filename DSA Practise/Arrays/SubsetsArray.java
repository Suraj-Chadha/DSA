package Arrays;
import java.util.*;
import java.lang.Math;
public class SubsetsArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int nSets = (int)Math.pow(2,n);
        for(int i = 0; i < nSets; i++){
            int binary = DecimalToBinary(i);
            int num = binary;
            int pow = (int)Math.pow(10, n-1);
            int count = 0;
            while(count < 3){
                int d = num / pow;
                num = num % pow;
                pow = pow /10;
                if(d == 0){
                    System.out.print("-\t");
                }
                else{
                    System.out.print(arr[count] + "\t");
                }
                count++;
            }
            System.out.println(); 
        }
        scn.close();
    }
    public static int DecimalToBinary(int num){
        int p = 1;
        int ans = 0;
        while(num > 0){
            int rem = num % 2;
            ans += rem * p;
            p = p * 10;
            num = num/2;
        }
        return ans;
    }
}
