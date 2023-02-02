package Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ex13 {
    static int answer=0,n=0,m=0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public static void DFS(int v) {
        if(v==n) answer++;
        else{
            for(int nx : graph.get(v)){
                if(ch[nx]==0){
                    ch[nx]=1;
                    DFS(nx);
                    ch[nx]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        ch = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        DFS(1);
        System.out.println(answer);
    }
}
