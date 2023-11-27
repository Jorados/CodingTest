package Baekjoon;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 크리스마스 선물
public class ex14235 {

    static int n;
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();

            if(num>0){
                for(int j=0; j<num; j++){
                    int value = sc.nextInt();
                    pq.offer(value);
                }
                continue;
            }

            if(!pq.isEmpty()) System.out.println(pq.poll());
            else System.out.println(-1);
        }
    }
}
