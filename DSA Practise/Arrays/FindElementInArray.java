package Arrays;
import java.util.*;
public class FindElementInArray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = newArray(n);
        int d = scn.nextInt();
        int index = finElementInArray(arr,d);
        System.out.println(index);
        scn.close();
    }
    public static int[] newArray(int n){
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int finElementInArray(int[] arr, int d){
        // int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d){
                return i;
            }
        }
        return -1;
    }
}
