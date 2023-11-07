package Baekjoon;


import java.util.*;

// 케빈 베이컨의 6단계 법칙
public class ex1389 {
    static int answer=0;
    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> graph;

    public static int BFS(int st){
        boolean[] ch = new boolean[n+1];
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(st);
        ch[st]=true;

        // st에서 find를 찾을 때 최소거리로 찾아야한다.
        int[] dis = new int[n+1];
        int sum=0;

        while(!Q.isEmpty()){
            Integer poll = Q.poll();
            for(int nv : graph.get(poll)){
                if(!ch[nv]){
                    ch[nv]=true;
                    dis[nv] = dis[poll] + 1;
                    Q.offer(nv);
                }
            }
        }

        for(int i=1; i<dis.length; i++){
            if(i!=st){
                sum+=dis[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int min = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            int sum = BFS(i);
            if(min > sum) {
                min = sum;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
