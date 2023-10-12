package CodingTest.Greedy2;


// 원더랜드 (최소스패닝 트리) --> 최소비용으로 그래프를 연결하는거임.


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Dot implements Comparable<Dot>{
    int vex;
    int cost;
    public Dot(int vex,int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Dot o){
        return this.cost - o.cost;
    }
}
public class ex8 {
    static int n,m;
    static int answer=0;
    static boolean[] ch;
    static ArrayList<ArrayList<Dot>> graph;

    public static void BFS(int vex){
        PriorityQueue<Dot> pq = new PriorityQueue<>();
        pq.offer(new Dot(vex,0));

        while (!pq.isEmpty()){
            Dot poll = pq.poll();

            if(!ch[poll.vex]){
                ch[poll.vex] = true;
                answer += poll.cost;
                for(Dot x : graph.get(poll.vex)){
                    if(!ch[x.vex]){
                        pq.offer(new Dot(x.vex,x.cost));
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        graph = new ArrayList<ArrayList<Dot>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new Dot(b,c));
            graph.get(b).add(new Dot(a,c));
        }

        ch = new boolean[n+1];
        BFS(1);
        System.out.println(answer);
    }
}
