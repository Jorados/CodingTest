package Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex14 {
    static int answer=0,n=0,m=0;
    static int[] ch,dis;
    static ArrayList<ArrayList<Integer>> graph;

    public static void DFS(int v) {

        ch[v]=1;
        dis[v]=0;
        Queue<Integer> Q= new LinkedList<>();
        Q.offer(v);
        while (!Q.isEmpty()){
            int x = Q.poll();
            for(int nx : graph.get(x)){
                if(ch[nx]==0){
                    ch[nx]=1;
                    Q.offer(nx);
                    dis[nx]=dis[x]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt(); //정점
        m=sc.nextInt(); //간선

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis= new int[n+1];

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        DFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+":" + dis[i]);
        }
    }
}
