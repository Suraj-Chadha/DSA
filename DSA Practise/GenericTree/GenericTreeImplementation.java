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
       list.add(root.data);

       for(Node child: root.children){
           serialize(child,list);
       }
       list.add(-1);
    }

    public static int treeSize(Node root){
        int size = 0;
        for(Node child: root.children){
            size = size + treeSize(child); 
        }
        return size+1;
    }
    public static int maxOfTree(Node root){
        int max = root.data;
        for(Node child: root.children){
            int res = maxOfTree(child);
            if(res > max){
                max = res;
            }
        }
        return max;
    }
    public static int heightOfTree(Node root){
        int height = -1;
        for(Node child: root.children){
            int recA = heightOfTree(child);
            if(recA > height){
                height = recA;
            }
        }
        return height+1;
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
    public static void LevelOrderZigZag(Node root){
        LinkedList<Node> que = new LinkedList<>();
        LinkedList<Node> st = new LinkedList<>();
        que.addLast(root);
        int level = 0;
        while(que.size() > 0){
            Node temp = que.removeFirst();
            System.out.print(temp.data+" ");
            if(level % 2 == 0){
                for(Node child:temp.children){
                    st.addFirst(child);
                }
            }else{
                for(int i = temp.children.size()-1; i >=0; i--){
                    st.addFirst(temp.children.get(i));
                }
            }
            if(que.size() == 0){
                LinkedList<Node> temp2 = que;
                que = st;
                st = temp2;
                level++;
                System.out.println();
            }
            
        }
    }
    public static void LevelOrderLineWiseBetter(Node root){
        LinkedList<Node> list = new LinkedList<>();
        list.addLast(root);
        int size = 1;
        while(list.size() > 0){
            Node temp = list.removeFirst();
            System.out.print(temp.data+" ");
            size--;

            for(Node child: temp.children){
                list.addLast(child);
            }
            if(size == 0){
                System.out.println();
                size = list.size();
            }
           
        }
    }

    public static void display(Node root){
        StringBuilder sb = new StringBuilder();
        sb.append(root.data + "-->");
        for(Node child:root.children){
            sb.append(child.data + " ");
        }
        sb.append(".");
        System.out.println(sb);
        for(Node child:root.children){
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = constructor(arr);

        // DisplayLevelOrder(root);
        LevelOrderLineWise(root);
        ArrayList<Integer> list = new ArrayList<>();
        serialize(root,list);
        System.out.println("serialize of our generic tree is:"+list);
        int size = treeSize(root);
        System.out.println("size of our tree is equal to: "+size);
        int max = maxOfTree(root);
        System.out.println("Max of tree is:"+max);
        int height = heightOfTree(root);
        System.out.println(height);
        LevelOrderZigZag(root);
        System.out.println("Display ---- > ");
        display(root);
    }
}
