package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 작업 - S1 - DFS
public class ex21937 {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static int n,m;
    static boolean ch[];
    static int cnt=0;
    public static void DFS(int x) {
        ch[x]=true;
        for(int nx : list.get(x)){
            if(!ch[nx]){
                DFS(nx);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new boolean[n+1];

        for(int i=0; i<=n; i++) list.add(new ArrayList<Integer>());

        for(int j=0; j<m; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(b).add(a);
        }

        int x = sc.nextInt();
        DFS(x);

        for(int i=1; i<=n; i++){
            if(ch[i]==true && i!=x){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
