import java.util.*;
import java.io.*;
public class floodfill{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        floodFill(0,0,arr,"");
    }
    public static void floodFill(int sr, int sc, int[][] arr, String psf){

        if(sr < 0 || sr >= arr.length || sc < 0 || sc >= arr[0].length || arr[sr][sc] == 1){
            return;
        }
        if(sr == arr.length-1 && sc == arr[0].length-1){
            System.out.println(psf);
            return;
        }
        arr[sr][sc] = 1;
        floodFill(sr-1,sc,arr,psf+"t"); // top
        floodFill(sr,sc-1,arr,psf+"l"); //left
        floodFill(sr+1,sc,arr,psf+"d"); // down
        floodFill(sr,sc+1,arr,psf+"r"); //right
        arr[sr][sc] = 0;
    }
}   