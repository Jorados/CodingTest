package CodingTest.Greedy2;


import java.util.*;

// 다익스트라 알고리즘
class Edge implements Comparable<Edge>{
    int vex;
    int cost;
    public Edge(int vex,int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o){
        return this.cost - o.cost;
    }
}

public class ex5 {
    static int n,m;
    static int[] dis;
    static ArrayList<ArrayList<Edge>> graph;

    public static void BFS(int v){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v,0));
        dis[v]=0;

        while (!pq.isEmpty()){
            Edge poll = pq.poll();
            int now = poll.vex;
            int nowCost = poll.cost;

            if(nowCost>dis[now]) continue;

            for(Edge x : graph.get(now)){
                if(x.cost + nowCost < dis[x.vex]){
                    dis[x.vex] = x.cost + nowCost;
                    pq.offer(new Edge(x.vex,nowCost + x.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new Edge(b,c));
        }

        BFS(1);
        for(int i=2; i<=n; i++){
            if(dis[i] != Integer.MAX_VALUE) System.out.println("~~");
            else System.out.println("~~");
        }
    }
}
