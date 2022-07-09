import java.util.*;
public class floodfill {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        floodFillSolution(mat,0,0,"");
    }

    public static void floodFillSolution(int[][] arr, int sr, int sc, String asf){

        if(sr == arr.length-1 && sc == arr[0].length){
            System.out.println(asf);
            return;
        }

        if(sr < 0 || sr >= arr.length || sc < 0 || sc >= arr.length || arr[sr][sc] == 1){
            return;
        }

        arr[sr][sc] = 1;
        floodFillSolution(arr,sr-1,sc,asf+"t"); // top
        floodFillSolution(arr,sr,sc-1,asf+"l"); // left
        floodFillSolution(arr,sr+1,sc,asf+"d"); // down
        floodFillSolution(arr,sr,sc+1,asf+"r"); // right
        arr[sr][sc] = 0;

    }
}
