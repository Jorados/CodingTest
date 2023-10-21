package Baekjoon;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소 스패닝 트리 - G4

class Net implements Comparable<Net>{
    int v;
    int cost;
    public Net(int v, int cost){
        this.v=  v;
        this.cost = cost;
    }
    @Override
    public int compareTo(Net o){
        return this.cost - o.cost;
    }
}
public class ex1922 {

    static int n;
    static int m;
    static ArrayList<ArrayList<Net>> graph;
    static boolean[] ch;
    static int answer=0;
    public static void solution(){
        PriorityQueue<Net> pq = new PriorityQueue<>();
        pq.offer(new Net(1,0));

        while (!pq.isEmpty()){
            Net poll = pq.poll();

            if(!ch[poll.v]){
                ch[poll.v]=true;
                answer+=poll.cost;
                for(Net net : graph.get(poll.v)){
                    if(!ch[net.v]) pq.offer(new Net(net.v,net.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =  sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        ch = new boolean[n+1];
        m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=  sc.nextInt();

            graph.get(a).add(new Net(b,c)); //양방향
            graph.get(b).add(new Net(a,c));
        }

        solution();
        System.out.println(answer);
    }
}
