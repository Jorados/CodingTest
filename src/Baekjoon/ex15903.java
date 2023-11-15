package Baekjoon;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 카드 합체 놀이
public class ex15903 {

    static int n;
    static int m;
    static long[] arr;
    static long answer=0;
    static PriorityQueue<Long> pq = new PriorityQueue<>();

    public static void solution(){
        while(m-->0){
            Long poll1 = pq.poll();
            Long poll2 = pq.poll();

            long sum = poll1 + poll2;
            pq.offer(sum);
            pq.offer(sum);
        }

        for(long x : pq){
            answer+=x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=0; i<n; i++){
            pq.offer(sc.nextLong());
        }
        solution();
        System.out.println(answer);
    }
}
