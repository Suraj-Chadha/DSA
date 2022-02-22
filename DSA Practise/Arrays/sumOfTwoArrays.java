package Arrays;
import java.util.*;
public class sumOfTwoArrays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();
        int[] addArr = new int[n2 > n1 ? n2+1 : n1+1];
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = addArr.length - 1;
        while(k >= 0){
            int d = carry;
            if(i >= 0){
                d+= arr1[i];
                i--;
            }
            if(j >= 0){
                d+=arr2[j];
                j--;
            }
            carry = d/10;
            d = d%10;
            addArr[k] = d;
            k--;
        }
        int a = 0;
        if(addArr[0] == 0){
            a = 1;
        }
        for(; a < addArr.length; a++){
            System.out.print(addArr[a]);
        }
    }
}
