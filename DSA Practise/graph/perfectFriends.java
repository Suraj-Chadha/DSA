
import java.io.*;
import java.util.*;

public class perfectFriends {

    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }

    }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      ArrayList<Edge>[] graph = new ArrayList[n];
      
      for(int i = 0; i < n; i++){
         graph[i] = new ArrayList<>();
      }

      for(int i = 0; i < k; i++){
         String str = br.readLine();
         String[] strArr = str.split(" ");
         int v1 = Integer.parseInt(strArr[0]);
         int v2 = Integer.parseInt(strArr[1]);
         graph[v1].add(new Edge(v1,v2));
         graph[v2].add(new Edge(v2,v1));
      }

      ArrayList<Integer> noOfStudentsInOneClub =  new ArrayList<>();
      boolean[] visited = new boolean[n];
      for(int i = 0; i < n; i++){
         if(visited[i] == false){
            int count = connected(i,graph,visited);
            noOfStudentsInOneClub.add(count);
         }
      }      
      int noOfFriends = 0;
      for(int i = 0; i < noOfStudentsInOneClub.size(); i++){
         for(int j = i+1; j < noOfStudentsInOneClub.size(); j++){
            int c1 = noOfStudentsInOneClub.get(i);
            int c2 = noOfStudentsInOneClub.get(j);
            noOfFriends += c1 * c2;
         }
      }
      System.out.println(noOfFriends);
      
      
   }

    public static int connected(int src, ArrayList<Edge>[] graph, boolean[] visited) {
        int count = 1;
        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            int nbr = e.nbr;
            if (!visited[nbr]) {
                count += connected(nbr, graph, visited);
            }
        }
        return count;
    }
}