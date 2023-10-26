package Baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 촌수 계산 - DFS
public class ex2644_2 {
    static int n; // 사람수
    static int a,b;
    static int m;
    static boolean[] ch;
    static int answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    public static void DFS(int v,int L){
        if(v == b){
            answer = L;
            return;
        }

        for(int nx : graph.get(v)){
            if(!ch[nx]){
                ch[nx] = true;
                DFS(nx,L+1);
                ch[nx]= false;
            }
        }
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
        DFS(a,0);
        System.out.println(answer);
    }
}
