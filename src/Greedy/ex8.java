package Greedy;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Load2 implements Comparable<Load2>{
    int v;
    int cost;

    public Load2(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }
    @Override
    public int compareTo(Load2 o) {
        return this.cost - o.cost;
    }
}
public class ex8 {
    static int v,e;
    static int[] ch;
    static ArrayList<ArrayList<Load2>> graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();
        ch = new int[v+1];
        graph = new ArrayList<ArrayList<Load2>>();
        for(int i=0; i<=v; i++){
            graph.add(new ArrayList<Load2>());
        }

        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int e = sc.nextInt();
            graph.get(v1).add(new Load2(v2,e));
            graph.get(v2).add(new Load2(v1,e));
        }

        //프림
        int answer=0;
        PriorityQueue<Load2> PQ = new PriorityQueue<>();
        PQ.offer(new Load2(1,0));
        while(!PQ.isEmpty()){
            Load2 tmp = PQ.poll();
            int v = tmp.v;
            if(ch[v]==0){
                ch[v]=1;
                answer+=tmp.cost;
                for(Load2 x : graph.get(v)){
                    if(ch[x.v]==0) PQ.offer(new Load2(x.v,x.cost));
                }
            }
        }
        System.out.println(answer);

    }
}
