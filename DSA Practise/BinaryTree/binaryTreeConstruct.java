package BinaryTree;

import java.util.*;

public class binaryTreeConstruct {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Pair {
        int state;
        Node node;

        Pair(Node node) {
            this.state = 0;
            this.node = node;
        }
    }

    public static Node construct(Integer[] arr) {
        Stack<Pair> st = new Stack<>();

        Node root = new Node(arr[0]);
        Pair rootp = new Pair(root);
        st.push(rootp);

        int idx = 1;
        while (st.size() > 0) {
            Pair nodep = st.peek();

            if (nodep.state == 0) {
                if (arr[idx] != null) {
                    Node lchild = new Node(arr[idx++]);
                    nodep.node.left = lchild;
                    Pair lchildp = new Pair(lchild);
                    st.push(lchildp);
                } else {
                    nodep.node.left = null;
                    idx++;
                }
                
            } else if (nodep.state == 1) {
                if(arr[idx] != null){
                    Node rchild = new Node(arr[idx++]);
                    nodep.node.right = rchild;
                    Pair rchildp = new Pair(rchild);
                    st.push(rchildp);
                }else{
                    nodep.node.right = null;
                    idx++;
                }
            } else {
                st.pop(); // both left and right child added
            }
            nodep.state++;
        }
        return root;

    }

    public static void Display(Node node) {
        //base case
        if(node == null) return;
        String str = "";
        if(node.left != null){
            str += node.left.data;
        }else{
            str+=" . ";
        }
        str += " <- " + node.data + " -> ";
        if(node.right != null){
            str += node.right.data;
        }else{
            str+=" . ";
        }

        System.out.println(str);
        Display(node.left);
        Display(node.right);

    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[] {10,20,40,null,null,50,80,null,90,null,null,null,30,60,null,null,70,null,null};
        Node root = construct(arr);
        Display(root);
    }
}
