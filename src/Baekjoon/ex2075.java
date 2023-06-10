package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// n번째 큰 수 - S2 - 정렬
public class ex2075 {
    static int n;

    static PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    public static void solution(){
        for(int i=0; i<n-1; i++){
            q.poll();
        }

        System.out.println(q.poll());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                q.offer(sc.nextInt());
            }
        }
        solution();
    }
}
