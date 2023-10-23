package Baekjoon;


import java.util.*;

// 숨바꼭질 - BFS

public class ex6118 {
    // 거리가 가장 멀면서 값의 크기가 가장 작은거.
    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> graph;
    static int a,b,c; // 숨는곳 , 거리 , 같은거리 헛간의 개수

    public static void solution(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(1);
        boolean[] ch = new boolean[n+1];
        ch[1] = true;

        a = Integer.MAX_VALUE;
        while (!Q.isEmpty()){
            int size = Q.size();
            c = size;

            for(int s=0; s<size; s++){
                int now = Q.poll();
                a = Math.min(now,c);

                for(int nx : graph.get(now)){
                    if(!ch[nx]){
                        ch[nx]=true;
                        Q.offer(nx);
                    }
                }
            }
            b++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph = new ArrayList<>();
        }

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b =  sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        solution();
        System.out.println(a + " " + b + " " + c);
    }
}
