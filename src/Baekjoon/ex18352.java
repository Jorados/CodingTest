package Baekjoon;

import java.util.*;

// 특정 거리의 도시 찾기
public class ex18352{

    static int n,m,k,x;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;
    static ArrayList<Integer> answer = new ArrayList<>();
    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(x);
        ch[x]=true;

        int L=0;
        while (!Q.isEmpty()){
            int size = Q.size();
            L++;
            for(int i=0; i<size; i++){
                Integer poll = Q.poll();
                for(int nx : graph.get(poll)){
                    if(L==k && !ch[nx]){
                        answer.add(nx);
                    }
                    if(!ch[nx]){
                        ch[nx]=true;
                        Q.offer(nx);
                    }
                }
            }
        }
        return answer.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        ch = new boolean[n+1];
        m = sc.nextInt();

        k = sc.nextInt(); //거리
        x = sc.nextInt(); //출발점


        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
        }
        BFS();
        if(answer.size()==0){
            System.out.println(-1);
        }
        else{
            Collections.sort(answer);
            for(int x : answer){
                System.out.println(x);
            }
        }
    }
}
