package Recursive_Tree_Graph;


//이진트리 순회
//전위 중위 후위

class Node{
    int data;
    Node lt,rt; //node객체의 주소를 저장하는 변수
    public Node(int val){
        data=val;
        lt=rt=null;
    }
}

public class ex5 {

    public static void DFS(Node root){
        if(root==null) return;
        else {
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    static Node root;

    public static void main(String[] args) {
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        DFS(root);
    }
}
