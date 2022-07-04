import java.io.*;
import java.util.*;

public class heapImplementation {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }
    private void swap(int i, int j){
        int temp = data.get(i);
        data.set(i,data.get(j));
        data.set(j,temp);
    }
    private void upheapify(int idx){
        if(idx == 0) return;
        int pidx = (idx - 1)/2;
        if(data.get(idx) < data.get(pidx)){
            swap(idx,pidx);
            upheapify(pidx);
        }
    }
    public void add(int val) {
    //   O(log n)
        data.add(val);
        upheapify(data.size() - 1);
    }

    private void downheapify(int idx){
        int minPri = idx;

        int lidx = 2 * idx + 1;
        if(lidx < data.size() && data.get(lidx) < data.get(minPri)){
            minPri = lidx;
        }

        int ridx = 2 * idx + 2;
        if(ridx < data.size() && data.get(ridx) < data.get(minPri)){
            minPri = ridx;
        }

        if(minPri != idx){
            swap(idx,minPri);
            downheapify(minPri);
        }
    }

    public int remove() {
    //   O(log n)
        if(data.size() == 0){
            System.out.println("Underflow");
            return -1;
        }
        swap(0,data.size() - 1);
        int val = data.remove(data.size() - 1);
        downheapify(0);
        return val;
    }


    public int peek() {
    //   O(1)
    if(data.size() == 0){
        System.out.println("Underflow");
        return -1;
    }
    return data.get(0);
    }

    public int size() {
    //  O(1)
    return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}