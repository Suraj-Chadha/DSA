package GenericTree;

import java.util.*;

public class GenericTreeImplementation {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data) {
            this.data = data;
        }
    }

    public static void serialize(Node root, ArrayList<Integer> list){
        // base case`

        list.add(root.data);

        for(Node child: root.children){
            serialize(child,list);
        }
        list.add(-1);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = constructor(arr);

        // DisplayLevelOrder(root);
        LevelOrderLineWise(root);
        ArrayList<Integer> list = new ArrayList<>();
        serialize(root,list);
        System.out.println(list);
    }

    public static Node constructor(int[] arr){
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int val: arr){
            if(val != -1){
                Node node = new Node(val);
                st.push(node);
            }else{
                Node temp = st.pop();
                if(st.size() > 0)
                st.peek().children.add(temp);
                else root = temp;
            }
        }
        return root;
    }



    public static void DisplayLevelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for (Node child : temp.children) {
                queue.add(child);
            }
        }
        System.out.println(".");
    }

    public static void LevelOrderLineWise(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        Queue<Node> childQ = new ArrayDeque<>();
        while(queue.size() > 0){
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for(Node child: temp.children){
                childQ.add(child);
            }
            if(queue.size() == 0){
                queue = childQ;
                childQ = new ArrayDeque<>();
                System.out.println();
            }

        }
    }
    // public static void LevelOrderZigZag(Node root){
    //     int level = 0;
    //     Queue<Node> q = new ArrayDeque<>(); // ArrayDeque --> Queue with Array list in backend
    //     Queue<Node> cq = new ArrayDeque<>();

    //     q.add(root);
    //     while(q.size() > 0){
    //         Node temp = 
    //     }
    // }
}
