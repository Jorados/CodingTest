package Baekjoon;


import java.util.Scanner;

// 파도반 수열 - S3 - DP
public class ex9461 {
    static int n;
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        dp = new long[101];

        dp[0]=1;
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        dp[4]=2;
        dp[5]=2;

        for(int i=6; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-5];
        }

        while(n-- >0){
            int s = sc.nextInt();
            System.out.println(dp[s]);
        }

    }
}
