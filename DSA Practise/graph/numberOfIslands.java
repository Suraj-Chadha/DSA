import java.io.*;
import java.util.*;
public class numberOfIslands {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      ArrayList<ArrayList<Integer>> components = new ArrayList<>();
      boolean[][] visited = new boolean[m][n];
      int count = 0;
      for(int i = 0; i < m; i++){
         for(int j = 0; j < n; j++){
            if(arr[i][j] == 0 && visited[i][j] == false){
               searchIslands(i,j,arr,visited);
               count++;
            }
         }
      }
      System.out.println(count);

   }
   public static void searchIslands(int r, int c, int[][] graph, boolean[][] visited){
      if(r < 0 || r >= graph.length || c < 0 || c >= graph[0].length || graph[r][c] == 1){
         return;
      }
      if(visited[r][c] ==  true){
         return;
      }

      visited[r][c] = true;

      searchIslands(r-1,c,graph,visited);
      searchIslands(r,c-1,graph,visited);
      searchIslands(r+1,c,graph,visited);
      searchIslands(r,c+1,graph,visited);
   }

}