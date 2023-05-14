package Baekjoon;


import java.util.Scanner;

// 파도반 수열 - S3 - DP
public class ex9461 {
    static int n;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dp = new int[100];

        dp[0]=1;
        dp[1]=1;
        dp[2]=1;

        for(int i=3; i<dp.length; i++){
            dp[i] = dp[i-2] + dp[i-3];
        }
        System.out.println(dp[n-1]);

    }
}
