package CodingTest.DFS_BFS_BASIC;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리 (단방향)
public class ex2 {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;
    static int[] dis;

    public static void BFS(int v){
        ch[v] = true;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);

        while(!Q.isEmpty()){
            Integer poll = Q.poll();
            for(int nx : graph.get(poll)){
                if(!ch[nx]){
                    ch[nx]=true;
                    Q.offer(nx);
                    dis[nx] = dis[poll]+1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b); // 단방향
        }

        ch = new boolean[n+1];
        dis = new int[n+1];

        BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }

}
