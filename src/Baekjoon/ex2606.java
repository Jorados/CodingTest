package Baekjoon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 바이러스
public class ex2606 {
    static int n;
    static int m;
    static int answer=0;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] ch;
    public static void BFS(int v){

        Queue<Integer> Q = new LinkedList<>();
        ch[1]=true;
        Q.offer(1);

        while (!Q.isEmpty()){
            int size = Q.size();
            for(int i=0; i<size; i++){
                Integer poll = Q.poll();
                for(int nv : list.get(poll)){
                    if(!ch[nv]){
                        answer++;
                        ch[nv]=true;
                        Q.offer(nv);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        list = new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }
        ch = new boolean[n+1];
        BFS(1);
        System.out.println(answer);
    }

}
