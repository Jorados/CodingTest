package Recursive_Tree_Graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 최단거리 인접리스트
public class ex13 {

    static int n,m;
    static int[] ch,dis;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        while(!Q.isEmpty()){
            Integer x = Q.poll();
            for(int nx : graph.get(x)){
                if(ch[nx]==0){
                    ch[nx]=1;
                    Q.offer(nx);
                    dis[nx] = dis[x]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        dis[1]=0;
        BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i + " : " + dis[i]);
        }

    }
}
