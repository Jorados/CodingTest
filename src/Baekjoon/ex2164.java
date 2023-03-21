package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 - 카드2 - S4
public class ex2164 {

    public static int solution(int n){
        int answer=0;
        Queue<Integer> Q =  new LinkedList<>();

        for(int i=1; i<=n; i++) Q.offer(i);

        while(!Q.isEmpty()) {
            if (Q.size() == 1) {
                answer = Q.peek();
                break;
            }
            Q.poll();
            Q.offer(Q.poll());
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
