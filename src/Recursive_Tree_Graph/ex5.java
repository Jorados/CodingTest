package Recursive_Tree_Graph;


class Node2 {
    int data;
    Node2 lt,rt;
    public Node2(int val) {
        data = val;
        lt=rt=null;
    }
}
public class ex5 {

    static Node2 root;
    public static void DFS(Node2 root){
        if(root == null) return;
        else{
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        root = new Node2(1);
        root.lt = new Node2(2);
        root.rt=new Node2(3);
        root.lt.lt=new Node2(4);
        root.lt.rt=new Node2(5);
        root.rt.lt=new Node2(6);
        root.rt.rt=new Node2(7);
        DFS(root);
    }
}
