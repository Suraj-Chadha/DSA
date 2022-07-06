// package PriorityQueue;
import java.io.*;
import java.util.*;
public class MedianPriorityQueue {
    

  public static class MyMedianPriorityQueue {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MyMedianPriorityQueue() {
      left = new PriorityQueue<>(Collections.reverseOrder());
      right = new PriorityQueue<>();
    }

    // public void add(int val) {
      
    // }

    // public int remove() {
      
    // }

    // public int peek() {
      
    // }

    // public int size() {
      
    // }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MyMedianPriorityQueue qu = new MyMedianPriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        // qu.add(val);
      // } else if (str.startsWith("remove")) {
      //   int val = qu.remove();
      //   if (val != -1) {
      //     System.out.println(val);
      //   }
      // } else if (str.startsWith("peek")) {
      //   int val = qu.peek();
      //   if (val != -1) {
      //     System.out.println(val);
      //   }
      // } else if (str.startsWith("size")) {
      //   System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}