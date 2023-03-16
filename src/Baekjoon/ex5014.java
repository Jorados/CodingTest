package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 스타트링크 - 5014 - s1
public class ex5014 {
    // F(총 층수) S(시작점) G(도착점) U(업) D(다운)
    // 10        1        10       2     1
    static int F,S,G,U,D;
    static int[] visit;

    public static void BFS(int F, int S, int G, int U, int D){
        Queue<Integer> Q = new LinkedList<>();
        Q.add(S); //시작 점
        visit[S]=1;
        while(!Q.isEmpty()){
            int state = Q.poll();
            if(state==G) System.out.println(visit[state]-1);

            if(state+U<=F && visit[state+U]==0){
                visit[state+U] = visit[state]+1;
                Q.add(state+U);
            }

            if(state-D>0 && visit[state-D]==0){
                visit[state-D] = visit[state]+1;
                Q.add(state-D);
            }
        }
        if(visit[G]==0) System.out.println("use the stairs");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        F = sc.nextInt();
        S = sc.nextInt();
        G = sc.nextInt();
        U = sc.nextInt();
        D = sc.nextInt();
        visit = new int[F+1];

        BFS(F,S,G,U,D);
    }

}
