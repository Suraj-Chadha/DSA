// https://www.codechef.com/COOK141D/problems/DOUBLEDDIST
package CodeChef;
import java.util.*;
import java.io.*;
public class DoubleDistance {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        
        int tc = scn.nextInt();
        while(tc > 0){
            testCases();
            tc--;
        }
    }
    public static void testCases(){
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        //for an array to follow the sequence it must be either an increasing sorting or decreasing sorting
        Arrays.sort(arr);
        for(int i = 1; i < n-1; i++){
            if(arr[i]-arr[i-1] == 2*(arr[i+1]-arr[i]) || 2*(arr[i]-arr[i-1]) == (arr[i+1]-arr[i])){
                continue;
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
