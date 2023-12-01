package Baekjoon;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 돌다리
public class ex12761 {
    static int answer=0;
    static int A,B;
    static int st,et;
    static boolean[] ch;
    static int L=0;
    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(st);
        ch[st]=true;
        while (!Q.isEmpty()){
            int size = Q.size();
            for(int i=0; i<size; i++){
                Integer poll = Q.poll();
                for(int nx : new int[]{poll+1,poll-1,poll+A,poll-A,poll+B,poll-B,poll*A,poll*B}) {
                    if(nx <= 100000 && nx >= 0 && !ch[nx]){
                        ch[nx]=true;
                        if (nx == et) return L+1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        st = sc.nextInt();
        et = sc.nextInt();

        ch = new boolean[100001];

        BFS();
        System.out.println(L+1);
    }
}
