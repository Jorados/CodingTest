package CodingTest.Graph;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소 비행료 - 다익스트라
class Edge2 implements Comparable<Edge2>{
    int vex;
    int cost;
    public Edge2(int vex,int cost){
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge2 o){
        return this.cost - o.cost;
    }

}
public class ex1 {

    static int answer=0;
    static int n,m;
    static ArrayList<ArrayList<Edge2>> graph;
    static int[] dis;
    static int s,e,k;

    public static void BFS(int vex){
        PriorityQueue<Edge2> pq = new PriorityQueue<>();
        pq.offer(new Edge2(vex,0));

        int L= 0;
        dis[vex] = 0;
        while (!pq.isEmpty()){

            int size = pq.size();
            for(int i=0; i<size; i++){
                Edge2 poll = pq.poll();
                int now = poll.vex;
                int nowCost = poll.cost;
                for(Edge2 x : graph.get(now)){
                    if(x.cost + nowCost < dis[x.vex]){
                        dis[x.vex] = x.cost + nowCost;
                        pq.offer(new Edge2(x.vex,x.cost + nowCost));
                    }
                }
            }
            L++;
            if(L>k) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge2>>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        dis = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new Edge2(b,c));
        }
        s = sc.nextInt();
        e = sc.nextInt();
        k = sc.nextInt();

        BFS(0);
        if(dis[e]==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(dis[e]);
    }
}
