package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 키 순서
public class ex2458 {
    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int answer=0;
    static boolean flag1 = false;
    static boolean flag2 = true;


    // 각 좌표에서 해당 좌표에 도달가능한지

    public static void DFS1(int now, int et, boolean[] ch,boolean[] visited,int st){
        if(now==et){
            ch[st]=true;
            return;
        }

        for(int nx : graph.get(now)){
            if(!visited[nx]){
                visited[nx]=true;
                DFS1(nx,et,ch,visited,st);
                visited[nx]=false;
            }
        }
    }

    // DFS1에서 해당좌표에 도달하지 못한 좌표의 graph.get()으로 도달할수있는지 최종점검
    public static void DFS2(int now,boolean[] ch){
        for(int nx : graph.get(now)){
            if(!ch[nx]){
                ch[nx]=true;
                DFS2(nx,ch);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
        }


        for(int i=1; i<=n; i++){
            boolean[] ch = new boolean[n+1]; // 메인 체크배열
            // 각 좌표에서 해당 i 좌표에 도달할수있는지.
            for(int j=1; j<=n; j++){
                boolean[] visited = new boolean[n+1]; // 체크배열
                DFS1(j,i,ch,visited,j);

                if(i!=j && !ch[j]) flag1 = true;
            }

            // 못들린 곳이 있으면 해당좌표에서 다른 좌표에 갈수있는지 체크.
            if(flag1){
                DFS2(i,ch);
            }

            for(int j=1; j<ch.length; j++){
                if(!ch[j]) {
                    flag2 = false;
                }
            }

            if(!flag1 || flag2) answer++;
            flag1 = false;
            flag2 = true;
        }



        System.out.println(answer);
    }
}
