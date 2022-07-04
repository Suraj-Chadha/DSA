package BinaryTree;
import java.io.*;
import java.util.*;


public class isBalanced {
    

  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  public static boolean isBalancedTree(Node node){
    if(node == null) return true;

    int hLeft = height(node.left);
    int hRight = height(node.right);
    if(Math.abs(hLeft - hRight) > 1) return false;
    boolean balance = isBalancedTree(node.left);
    if(!balance) return false;
    balance = isBalancedTree(node.right);
    if(!balance) return false;
    
    return true;
  }
  static boolean isBalanced = true;
  public static int isTreeBalanced(Node node){
    if(node == null) return -1;
    int lth = isTreeBalanced(node.left);
    int rth = isTreeBalanced(node.right);
    if(Math.abs(lth-rth) > 1) isBalanced = false;
    return Math.max(lth,rth)+1;
  }
  public static class TreePair{
      int h = -1;
      boolean balance;
  }
  public static TreePair isTreeBalanced2(Node node){
    if(node == null){
        TreePair bp = new TreePair();
        bp.balance = true;
        return bp;
    }
    TreePair lp = isTreeBalanced2(node.left);
    TreePair rp = isTreeBalanced2(node.right);

    TreePair mp = new TreePair();
    mp.h = Math.max(lp.h,rp.h) + 1;
    boolean nodeBalance = (Math.abs(lp.h - rp.h) < 1 ? true : false);
    mp.balance = nodeBalance && lp.balance && rp.balance;
    return mp;
  }

  public static int height(Node node){
      return (node == null ? -1 : Math.max(height(node.left),height(node.right))+1);
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
    // boolean isTheTreeBalanced = isBalancedTree(root);
    // System.out.println(isTheTreeBalanced);
    // isTreeBalanced(root);
    // System.out.println(isBalanced);
     TreePair tp =  isTreeBalanced2(root);
    System.out.println(tp.balance);
  }

}