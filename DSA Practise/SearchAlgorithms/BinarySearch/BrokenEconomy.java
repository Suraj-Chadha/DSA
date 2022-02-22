package SearchAlgorithms.BinarySearch;
import java.util.*;
public class BrokenEconomy {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
         findEle(arr,d);
        //System.out.println(index);
        scn.close();
    }
    public static void findEle(int[] arr, int d){
        int left = 0;
        int right = arr.length - 1;
        int floor = -1, ceil = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == d){
                // return mid;
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }else if(arr[mid] < d){
                left = mid+1;
                floor = arr[mid];
            }else{
                right = mid - 1;
                ceil = arr[mid];
            }
            System.out.println(ceil);
            System.out.println(floor);

        }
        // return -1;

    }
}
