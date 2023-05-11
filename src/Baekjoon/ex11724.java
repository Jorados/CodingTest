package Baekjoon;


import java.util.Scanner;

// 연결 요소의 개수 - S2
public class ex11724 {

    static int n; // 정점의 개수
    static int m; // 간선의 개수
    static int[][] graph;
    static boolean[] ch;
    static int cnt=0;

    public static void DFS(int v){
        if(ch[v]==true) return; // 밑에 for 문에 의해 계속 같은 곳 방문 가능성 때문에
        else{
            ch[v]=true;
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1){
                    DFS(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n+1][n+1];
        ch = new boolean[n+1];

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for(int i=1; i<=n; i++){
            if(!ch[i]) {
                DFS(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
