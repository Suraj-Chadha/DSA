package Array2D;
import java.util.*;
import java.io.*;
public class exitPuzzleMatrix {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        exitPoint(arr);
    }
    public static void exitPoint(int[][] arr){
        int i = 0;
        int j = 0;
        while( (i > 0 || i <= arr.length) && (j > 0 || j <=arr[0].length)){
            if((i > 0 || i <= arr.length) && (j > 0 || j <=arr[0].length)){
            for(int k = i ; k < arr[0].length; k++){
                if(arr[k][j] == 1){
                    j++;
                    break;
                }
                j++;
            }
        }
        if((i > 0 || i <= arr.length) && (j > 0 || j <=arr[0].length)){
            for(int k = j ; k < arr.length; k++){
                if(arr[i][k] == 1){
                    i++;
                    break;
                }
                i++;
            }
        }
        if((i > 0 || i <= arr.length) && (j > 0 || j <=arr[0].length)){
            for(int k = i ; k >=0; k--){
                if(arr[k][j] == 1){
                    j--;
                    break;
                }
               j--;
            }
        }
        if((i > 0 || i <= arr.length) && (j > 0 || j <=arr[0].length)){
            for(int k = i ; k >= 0; k--){
                if(arr[i][k] == 1){
                    i--;
                    break;
                }
                i--;
            }
        }
    }
    System.out.println(i+" "+j);
    }
}
