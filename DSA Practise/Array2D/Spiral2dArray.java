package Array2D;
import java.util.*;
public class Spiral2dArray {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }

    int top = 0;
    int bottom = arr.length - 1;
    int left = 0;
    int right = arr[0].length - 1;
    //down Direction
    int count = 1;
    while(count <= n*m){
    for(int i = top ; i <= bottom && count <= n*m; i++){
        System.out.println(arr[i][left]);
        count++;
    }
    left++;
    for(int i = left; i<= right && count <= n*m;i++){
        System.out.println(arr[bottom][i]);
        count++;
    }
    bottom--;
    for(int i = bottom; i>= top && count <= n*m; i--){
        System.out.println(arr[i][right]);
        count++;
    }
    right--;
    for(int i = right; i>= left && count <= n*m;i--){
        System.out.println(arr[top][i]);
        count++;
    }
    top++;
}
}
}
