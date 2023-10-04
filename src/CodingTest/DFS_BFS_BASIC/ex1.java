package CodingTest.DFS_BFS_BASIC;


import java.util.ArrayList;
import java.util.Scanner;

// 인접리스트로 문제풀기
public class ex1 {

    static int n,answer=0;
    static int m;
    static ArrayList<ArrayList<Integer>> graph;

    static boolean[] ch;

    public static void DFS(int v){
        if(v == n){
            answer++;
        }

        for(int nx : graph.get(v)){
            if(!ch[nx]){
                ch[nx]=true;
                DFS(nx);
                ch[nx]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b); // 단방향 그래프 완성
        }
        ch = new boolean[n+1];
        ch[1] = true;
        DFS(1);
        System.out.println(answer);
    }
}
