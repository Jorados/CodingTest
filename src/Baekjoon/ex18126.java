package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 너구리 구구 - DFS
// 그냥 끝으로 가면된다.
// 인접리스트를 이용한 경로 탐색 문제. 기본이면서 매우 중요한 문제.
class Edge{
    int y;
    int dis;
    public Edge(int y,int dis){
        this.y = y;
        this.dis = dis;
    }
}
public class ex18126 {
    static ArrayList<ArrayList<Edge>> graph;
    static boolean[] ch;
    static int n;
    static long answer=0;

    public static void DFS(int now,long dis){
        if(answer<dis){
            answer = dis;
        }

        for(Edge edge : graph.get(now)){
            if(ch[edge.y]) continue;
            else{
                ch[edge.y] = true;
                DFS(edge.y, dis+ edge.dis);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new boolean[n+1];
        graph=new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }

        for(int i=1; i<=n-1; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dis = sc.nextInt();

            //양방향 그래프.
            graph.get(x).add(new Edge(y,dis));
            graph.get(y).add(new Edge(x,dis));
        }

        ch[1] = true;
        DFS(1,0);
        System.out.println(answer);
    }

}
