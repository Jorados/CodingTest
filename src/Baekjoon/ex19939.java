package Baekjoon;

import java.util.Scanner;

// 박 터뜨리기 - 그리디
public class ex19939 {

    static int num , box;
    static int answer=0;
    static int[] dp;

    public static void solution(){
        if(num<=box) {
            answer=-1;
            return;
        }

        int a = num % box; // 나머지 공 수
        if(a==0) a = box;

        if(a==dp[box]) answer = box-1;
        else answer=-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        box = sc.nextInt();

        dp = new int[box+1];
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3; i<dp.length; i++){
            dp[i] = dp[i-1] + (i-1);
        }

        solution();
        System.out.println(answer);
    }
}
