package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

// 최소 힙
public class ex1927 {
    static int n;
    static int[] arr;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void solution(){
        for(int x : arr){
            if(x == 0){
                if(pq.size() == 0){
                    System.out.println(0);
                }
                else{
                    System.out.println(pq.poll());
                }
            }
            else{
                pq.offer(x);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution();
    }
}
