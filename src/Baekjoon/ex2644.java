package Baekjoon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 촌수계산 - DFS / BFS 둘다될듯
public class ex2644 {

    static int n; // 사람수
    static int a,b;
    static int m;
    static boolean[] ch;
    static int answer=0;

    static ArrayList<ArrayList<Integer>> graph;
    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(a);
        ch[a]=true;

        int L=0;
        while (!Q.isEmpty()){
            int size = Q.size();
            for(int i=0; i<size; i++){
                Integer x = Q.poll();
                for(int nx : graph.get(x)){
                    if(nx == b) {
                        answer = L+1;
                        return answer;
                    }
                    if(!ch[nx]){
                        ch[nx]=true;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b =  sc.nextInt();
        graph = new ArrayList<>();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            graph.get(l).add(r);
            graph.get(r).add(l);
        }

        ch = new boolean[n+1];

        System.out.println(BFS());
    }
}
