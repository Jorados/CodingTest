package Baekjoon;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 국회의원 선거 - 그리디
public class ex1417 {

    static int n;
    static int[] arr;
    static int answer=0;
    static int now=0;
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public static void solution(){
        if(n==1) return;
        while(true){
            Integer poll = pq.poll();

            if(poll >= now){
                now+=1;
                answer+=1;
                pq.offer(poll-1);
            }
            else break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n  = sc.nextInt();
        arr = new int[n];

        now = sc.nextInt(); //5
        for(int i=1; i<n; i++){
            pq.offer(sc.nextInt()); // 10 8 7 3
        }

        solution();
        System.out.println(answer);
    }
}
