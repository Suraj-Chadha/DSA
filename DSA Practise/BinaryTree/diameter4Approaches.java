package BinaryTree;
import java.io.*;
import java.util.*;
public class diameter4Approaches {

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

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  }
  static int dia = 0;
  public static int diameter1(Node node) {
    if(node == null) return -1;
    int lth = diameter1(node.left);
    int rth = diameter1(node.right);

    int cand = lth + rth + 2;
    if( cand > dia) dia = cand;

    return Math.max(lth,rth) + 1;
  }
  public static class diaMover{
      int dia = 0;
  }
  public static int diameter2(Node node, diaMover mover){
    if(node == null) return -1;
    int lth = diameter2(node.left,mover);
    int rth = diameter2(node.right,mover);

    int cand = lth + rth + 2;
    if(cand > mover.dia) mover.dia = cand;
    return Math.max(lth,rth) + 1;
  }

  public static int diameter3(Node node){
    if(node == null) return 0;
    int lth = height(node.left);
    int rth = height(node.right);
    int maxDiaForNode = lth + rth + 2;

    int diaL = diameter3(node.left);
    int diaR = diameter3(node.right);

    return Math.max(maxDiaForNode,Math.max(diaL,diaR));

  }
//   we will keep a pair which will update height and diameter of all the nodes which will help us get height of tree in O(1)
  public static class DiaPair{
      int dia = 0;
      int h = -1;
  }
  public static DiaPair diameter4(Node node){
    if(node == null){ 
        return new DiaPair();
    }
    DiaPair ltp = diameter4(node.left);
    DiaPair rtp = diameter4(node.right);

    DiaPair ndp = new DiaPair();
    ndp.h = Math.max(ltp.h,rtp.h) + 1;
    ndp.dia = Math.max(ltp.h + rtp.h + 2, Math.max(ltp.dia,rtp.dia));

    return ndp;

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
//  diameter 1
    // int diameter = 0;
    // diameter = diameter1(root);
    // System.out.println(dia);

// diameter 2
    // diaMover dm = new diaMover();
    // diameter2(root, dm);
    // System.out.println(dm.dia);

// diameter 3
    // int diameter = 0;
    // diameter = diameter3(root);
    // System.out.println(diameter);

// diameter 4
    DiaPair dia = diameter4(root);
    System.out.println(dia.dia);
  }

}