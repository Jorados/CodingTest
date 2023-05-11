package Baekjoon;


import java.util.Scanner;

// 계단 오르기 - S3
public class ex2579 {

    static int n;
    static int[] stairs;
    static int[] dp;
    public static void solution(){
        dp[0]=0;
        dp[1]=stairs[1];

        if(n>=2) dp[2] = stairs[1] + stairs[2];

        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]+stairs[i-1]) + stairs[i];
        }

        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        stairs = new int[n+1];
        dp = new int[n+1];

        for(int i=1; i<=n; i++){
            stairs[i] = sc.nextInt();
        }
        solution();
    }
}
