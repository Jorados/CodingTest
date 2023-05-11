package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 평범한 배낭 - DP문제 - G5

public class ex12865 {
    static int n; // 물건의 개수
    static int k;  // 최대 무게
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        int[] w = new int[n+1];
        int[] v = new int[n+1];
        int[] dp = new int[k+1];

        for(int i=1; i<=n; i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }

        for(int i=1; i<=n; i++){
            for(int j=k; j-w[i]>=0; j--){
                dp[j]=Math.max(dp[j] , dp[j-w[i]] + v[i]);
            }
        }

        System.out.println(dp[k]);
    }
}
