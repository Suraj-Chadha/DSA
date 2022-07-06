import java.io.*;
import java.util.*;

public class heapConstructor {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue(int[] arr){
        data = new ArrayList<>();
        // step 1 --> O(1);
        for(int val: arr){
            data.add(val);
        }
        // step 2 downheapify from h-1 still O(1);
        for(int i = data.size()/2-1; i>= 0; i--){
            downheapify(i);
        }

    }
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
    int[] arr = {10,20,30,40,15,5,16,22,50};

    PriorityQueue pq = new PriorityQueue(arr);

    while(pq.size() > 0){
        System.out.print(pq.remove() + " ");
    }
    System.out.println();
    
  }
}