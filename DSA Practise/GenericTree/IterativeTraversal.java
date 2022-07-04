package GenericTree;

import java.io.*;
import java.util.*;

public class IterativeTraversal {

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
    static String preorder = "";
    static String postorder = "";
    public static class Pair {
        int state;
        Node node;
        Pair(Node node){
            this.state = -1;
            this.node = node;
        }
    }

    public static void IterativePreandPostOrder(Node node) {
        Stack<Pair> stack = new Stack<>();
        Pair rootp = new Pair(node);
        stack.push(rootp);

        while(stack.size() > 0){
            Pair nodep = stack.peek();
            if(nodep.state == -1){
                preorder += nodep.node.data + " ";
                nodep.state++;
            }else if(nodep.state == nodep.node.children.size()){
                postorder += nodep.node.data + " ";
                nodep.state++;
            }else if(nodep.state >= 0 && nodep.state < nodep.node.children.size()){
                Node child = nodep.node.children.get(nodep.state);
                Pair childp = new Pair(child);
                stack.push(childp);
                nodep.state++;
            }else{
                stack.pop();
            }
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
        IterativePreandPostOrder(root);
        System.out.println(preorder);
        System.out.println(postorder);
    }

}