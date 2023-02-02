package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class ex10 {
    static Node3 root;

    public static int BFS(int L, Node3 root) {
        Queue<Node3> Q = new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i< len; i++){
                Node3 x = Q.poll();
                if(x.lt ==null && x.rt ==null) return L;
                if(x.lt != null) Q.offer(x.lt);
                if(x.rt != null) Q.offer(x.rt);
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        root = new Node3(1);
        root.lt = new Node3(2);
        root.rt=new Node3(3);
        root.lt.lt=new Node3(4);
        root.lt.rt=new Node3(5);
        System.out.println(BFS(0,root));
    }
}
