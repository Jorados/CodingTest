package Baekjoon;


import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소스패닝 트리
public class ex1197 {

    static int n;
    static int m;
    static ArrayList<ArrayList<City>> graph;
    static int answer=0;
    static boolean[] ch;

    public static void solution(){
        PriorityQueue<City> pq = new PriorityQueue<>();
        pq.offer(new City(1,0));

        while (!pq.isEmpty()){
            City poll = pq.poll();
            if(!ch[poll.v]){
                ch[poll.v] = true;
                answer+=poll.cost;
                for(City c : graph.get(poll.v)){
                    if(!ch[c.v]) pq.offer(new City(c.v,c.cost));
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new City(b,c));
            graph.get(b).add(new City(a,c));
        }
        ch = new boolean[n+1];
        solution();
        System.out.println(answer);
    }
}
