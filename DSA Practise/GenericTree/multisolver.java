package GenericTree;

import java.io.*;
import java.util.*;

public class multisolver {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    static int sum = 0;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int height = -1;
    static int size = 0;

    public static void multisolver(Node node, int depth) {

        sum += node.data;
        if (node.data < min) {
            min = node.data;
        }
        if (node.data > max) {
            max = node.data;
        }
        if (depth > height) {
            height = depth;
        }
        size++;
        for (Node child : node.children) {
            multisolver(child, depth + 1);
        }
    }

    public static class HeapMover {
        int size = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int height = -1;
        int secondLargest = Integer.MIN_VALUE;
    }

    public static void multisolver2(Node node, int depth, HeapMover mover) {
        mover.sum += node.data;
        mover.size++;
        if (mover.max < node.data)
            mover.max = node.data;
        if (mover.min > node.data)
            mover.min = node.data;
        if (mover.height < depth)
            mover.height = depth;

        for(Node child: node.children){
            multisolver2(child,depth+1,mover);
        }
    }
    public static void secondLargest(Node node, HeapMover mover){
        if(node.data > mover.max){
            mover.secondLargest = mover.max;
            mover.max = node.data;
        }else if(node.data > mover.secondLargest){
            mover.secondLargest = node.data;
        }

        for (Node child: node.children){
            secondLargest(child, mover);
        }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        multisolver(root, 0);
        System.out.println("size = " + size);
        System.out.println("sum = " + sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("height = " + height);
        HeapMover mover = new HeapMover();
        System.out.println("multisolver 2 using class to keep variable in heap down");
        multisolver2(root, 0, mover);
        System.out.println("size = " + mover.size);
        System.out.println("sum = " + mover.sum);
        System.out.println("min = " + mover.min);
        System.out.println("max = " + mover.max);
        System.out.println("height = " + mover.height);

        HeapMover mover2 = new HeapMover();
        secondLargest(root,mover2);
        System.out.println("largest element: "+mover2.max);
        System.out.println("second largest element: "+mover2.secondLargest);
    }

}