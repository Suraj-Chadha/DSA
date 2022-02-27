package Arrays;
import java.util.*;
public class SubArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int i = 0;
        while( i < n){
            int j = i;
            while(j < n){
                for(int k = i;k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                j++;
            }
            i++;
        }
        scn.close();
    }
}
