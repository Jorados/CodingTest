package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node2 lt,rt; //node객체의 주소를 저장하는 변수
    public Node2(int val){
        data=val;
        lt=rt=null;
    }
}
public class ex7 {
    static Node2 root;

    public static void BFS(Node2 root){
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L=1;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i=0; i<len; i++){
                Node2 poll = Q.poll();
                System.out.print(poll.data + " ");
                if(poll.lt!=null) Q.offer(poll.lt);
                if(poll.rt!=null) Q.offer(poll.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        root=new Node2(1);
        root.lt=new Node2(2);
        root.rt=new Node2(3);
        root.lt.lt=new Node2(4);
        root.lt.rt=new Node2(5);
        root.rt.lt=new Node2(6);
        root.rt.rt=new Node2(7);
        BFS(root);
    }

}
