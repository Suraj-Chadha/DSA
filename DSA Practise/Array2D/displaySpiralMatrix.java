package Array2D;
import java.util.*;
import java.io.*;
public class displaySpiralMatrix {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = Integer.parseInt(br.readLine());
            }
        }
        displaySpiralMatrix(mat);
    }
    public static void displaySpiralMatrix(int[][] mat){
        int top = 0;
        int left = 0;
        int bottom = mat.length - 1;
        int right = mat[0].length-1;
        int count = (bottom+1) * (right+1);
        while(count > 0){
            if(count > 0){
            for(int i = top; i <= bottom; i++){
                System.out.println(mat[i][left]);
                count--;
            }
            left++;
        }
        if(count > 0){
            for(int i = left; i <= right; i++){
                System.out.println(mat[bottom][i]);
                count--;
            }
            bottom--;
        }
        if(count > 0){
            for(int i = bottom; i >= top; i--){
                System.out.println(mat[i][right]);
                count--;
            }
            right--;
        }
        if(count > 0){
            for(int i = right; i >= left; i--){
                System.out.println(mat[top][i]);
                count--;
            }
            top++;
        }
        }
    }
}
