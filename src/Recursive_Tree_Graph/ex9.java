package Recursive_Tree_Graph;
class Node3 {
    int data;
    Node3 lt,rt; //node객체의 주소를 저장하는 변수
    public Node3(int val){
        data=val;
        lt=rt=null;
    }
}
public class ex9 {
     static Node3 root;

    public static int DFS(int L, Node3 root) {
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1,root.lt),DFS(L+1,root.rt));
    }

    public static void main(String[] args) {
        root = new Node3(1);
        root.lt = new Node3(2);
        root.rt=new Node3(3);
        root.lt.lt=new Node3(4);
        root.lt.rt=new Node3(5);
        System.out.println(DFS(0,root));
    }
}
