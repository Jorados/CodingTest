package Greedy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int vex;
    int cost;

    public Edge(int vex,int cost){
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}
public class ex5 {
    static int n,m;
    static ArrayList<ArrayList<Edge>> graph;
    static int dis[];

    public static void BFS(int v){
        PriorityQueue<Edge> PQ = new PriorityQueue<>();
        PQ.offer(new Edge(v,0));
        dis[v]=0;
        while(!PQ.isEmpty()){
            Edge tmp = PQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if(nowCost>dis[now]) continue;

            for(Edge x : graph.get(now)){
                if(nowCost + x.cost < dis[x.vex]){
                    dis[x.vex] = nowCost+x.cost;
                    PQ.offer(new Edge(x.vex, nowCost+x.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b,c));
        }
        BFS(1);
        for(int i=2; i<=n; i++){
            if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }
    }

}
