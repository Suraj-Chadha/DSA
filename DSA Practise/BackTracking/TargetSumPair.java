import java.util.*;
public class TargetSumPair {
    

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        tsp(arr,0,0,tar,"");
    }
    public static void tsp(int[] arr, int idx, int sos, int tar, String asf){
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(asf);
            }
            return;
        }
        if(sos > tar) return;

        tsp(arr,idx+1,sos+arr[idx],tar,asf+arr[idx]+", ");
        tsp(arr,idx+1,sos,tar,asf);
    }
}
