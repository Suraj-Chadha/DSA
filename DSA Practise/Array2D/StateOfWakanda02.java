package Array2D;
import java.util.*;
public class StateOfWakanda02 {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] arr = new int[n][n];
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
    
    for(int diag = 0; diag< arr.length; diag++){
        int i = 0;
        int j = diag;
        while(i < arr.length && j < arr.length){
            System.out.println(arr[i][j]);
            i++;
            j++;
        }
    }
    scn.close();
}
}
