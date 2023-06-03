package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// 알고리즘 수업 (깊이우선탐색) - S2 - 무방향그래프
public class ex24480 {

    static int n,m,v,cnt=1;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    static int[] ch;
    public static void DFS(int v){
        ch[v]=cnt++; // 각 정점마다 도달하는데 걸리는 횟수가 cnt,방문체크
        for(Integer x : list.get(v)){
            if(ch[x]>0) continue;
            DFS(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        ch = new int[n+1];
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            list.get(i).sort(Comparator.reverseOrder());
        }

        DFS(1);
        for(int i=1; i<=n; i++){
            System.out.println(ch[i]);
        }
    }

}
