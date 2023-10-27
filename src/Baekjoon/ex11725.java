package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 트리의 부모 찾기
public class ex11725 {

    static int n;
    static int[] dis;
    static boolean[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public static void solution(int L){
        ch[L]=true;
        for(int nx : graph.get(L)){
            if(!ch[nx]){
                ch[nx]=true;
                dis[nx]=L;
                solution(nx);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new boolean[n+1];
        dis = new int[n+1];

        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<n-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a); // 양방향 그래프
        }


        solution(1);

        int cnt=0;
        for(int x : dis){
            if(cnt>=2) System.out.println(x + " ");
            cnt++;
        }
    }
}
