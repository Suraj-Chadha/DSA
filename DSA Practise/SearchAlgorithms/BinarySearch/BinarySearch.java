package SearchAlgorithms.BinarySearch;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int index = findEle(arr,d);
        System.out.println(index);
        scn.close();
    }
    public static int findEle(int[] arr, int d){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == d){
                return mid;
            }else if(arr[mid] < d){
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
