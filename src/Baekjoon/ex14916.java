package Baekjoon;


import java.util.Scanner;

// 거스름돈 - s5 - DP
public class ex14916 {

    static int n;
    static long[] dp = new long[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        dp[0]=-1;
        dp[1]=-1;
        dp[2]=1;
        dp[3]=-1;
        dp[4]=2;
        dp[5]=1;
        dp[6]=3;
        dp[7]=2;
        dp[8]=4;
        dp[9]=3;
        dp[10]=2;

        for(int i=11; i<=n; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i=11; i<=n; i++){
            if(dp[i-2]==-1 && dp[i-5]==-1) dp[i] = -1;
            else if(dp[i-2]==-1) dp[i] = dp[i-5]+1;
            else if(dp[i-5]==-1) dp[i] = dp[i-2]+1;
            else dp[i] = Math.min(dp[i-2],dp[i-5]) + 1;
        }
        System.out.println(dp[n]);
    }
}
