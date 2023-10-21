package Baekjoon;


import java.util.ArrayList;
import java.util.Currency;
import java.util.PriorityQueue;
import java.util.Scanner;

class City implements Comparable<City> {
    int v;
    int cost;
    public City(int v,int cost){
        this.v = v;
        this.cost =cost;
    }
    @Override
    public int compareTo(City o){
        return this.cost - o.cost;
    }

}
public class ex1647 {

    static int n;
    static int m;
    static ArrayList<ArrayList<City>> graph;
    static boolean[] ch;
    static int answer=0;
    static int max = Integer.MIN_VALUE;

    public static void solution(){
        PriorityQueue<City> pq = new PriorityQueue<>();
        pq.offer(new City(1,0));

        while (!pq.isEmpty()){
            City poll = pq.poll();

            if(!ch[poll.v]){
                ch[poll.v]=true;
                answer+=poll.cost;
                max = Math.max(max,poll.cost);
                for(City city : graph.get(poll.v)){
                    if(!ch[city.v]) pq.offer(new City(city.v,city.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

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

            graph.get(a).add(new City(b,c)); //양방향
            graph.get(b).add(new City(a,c));
        }

        solution();
        System.out.println(answer - max);
    }

}
