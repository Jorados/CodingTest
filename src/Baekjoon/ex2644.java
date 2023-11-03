package Baekjoon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 촌수계산
public class ex2644 {

    static int n,answer=-1;
    static ArrayList<ArrayList<Integer>> graph;
    static int st,et;
    static int m;
    static boolean[] ch;
    public static void DFS(int L,int v){
        if(v==et){
            answer = L;
            return;
        }

        for(int nv : graph.get(v)){
            if(!ch[nv]){
                ch[nv]=true;
                DFS(L+1,nv);
                ch[nv]=false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n =  sc.nextInt();
        graph = new ArrayList<>();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        st = sc.nextInt();
        et = sc.nextInt();

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        ch = new boolean[n+1];
        DFS(0,st);
        System.out.println(answer);
    }
}
