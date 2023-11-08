package Baekjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 택배 배송
class Farmer implements Comparable<Farmer>{
    int v;
    int cost;
    public Farmer(int v,int cost){
        this.v = v;
        this.cost = cost;
    }
    @Override
    public int compareTo(Farmer o){
        return this.cost - o.cost;
    }
}
public class ex5972 {
    static int n,m;
    static ArrayList<ArrayList<Farmer>> graph;
    static boolean[] ch;
    static int[] dis;
    public static void BFS(){
        PriorityQueue<Farmer> pq = new PriorityQueue<>();
        pq.offer(new Farmer(1,0));
        //ch[1] = true;
        dis[1] = 0;

        while (!pq.isEmpty()){
            Farmer poll = pq.poll();
            int now = poll.v;
            int nowCost = poll.cost;

            if(nowCost > dis[now]) continue;

            for(Farmer x : graph.get(poll.v)){
                if(x.cost + nowCost < dis[x.v]){
                    dis[x.v] = x.cost + nowCost;
                    pq.offer(new Farmer(x.v,nowCost + x.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new Farmer(b,c));
            graph.get(b).add(new Farmer(a,c));
        }

        ch = new boolean[n+1];
        dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        BFS();

        System.out.println(dis[n]);
    }
}
