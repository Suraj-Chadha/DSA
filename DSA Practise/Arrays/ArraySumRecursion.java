package Arrays;
import java.util.*;
public class ArraySumRecursion{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = sum(arr);
        System.out.println(ans);
        scn.close();
    }
        public static int sum(int[] arr) {
            if(arr.length == 0)return 0;
            int ans = arr[arr.length-1];
            int[] arrnew = new int[arr.length-1];
            for(int i = 0; i < arrnew.length; i++) arrnew[i] = arr[i];
            return ans + sum(arrnew);
        }
}

