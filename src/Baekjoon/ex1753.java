package Baekjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최단경로
class Edge2 implements Comparable<Edge2>{
    int v;
    int cost;
    public Edge2(int v,int cost) {
        this.v = v;
        this.cost= cost;
    }
    @Override
    public int compareTo(Edge2 o){
        return this.cost - o.cost;
    }
}
public class ex1753 {
    static int n,m;
    static int k; // 시작 좌표
    static ArrayList<ArrayList<Edge2>> list;
    static int[] dis;
    public static void solution(){
        PriorityQueue<Edge2> pq = new PriorityQueue<>();
        pq.offer(new Edge2(k,0));
        dis[k]=0;

        while (!pq.isEmpty()){
            Edge2 poll = pq.poll();
            int now = poll.v;
            int nowCost = poll.cost;

            if(nowCost>dis[now]) continue;

            for(Edge2 x : list.get(now)){
                if(x.cost + nowCost < dis[x.v]){
                    dis[x.v] = x.cost+nowCost;
                    pq.offer(new Edge2(x.v,x.cost+nowCost));
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        k = sc.nextInt();

        list = new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            list.get(a).add(new Edge2(b,c));
        }

        solution();

        for(int i=k; i<=n; i++){
            if(dis[i] != Integer.MAX_VALUE) System.out.println(dis[i]);
            else System.out.println("INF");
        }

    }
}
