package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 회의실 배정 - S2

public class ex19621 {
    static int n;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[Math.max(2,n)];
        dp = new int[Math.max(2,n)];

        for(int i=0; i<n; i++){
            int st = sc.nextInt();
            int et = sc.nextInt();
            int num = sc.nextInt();
            arr[i] = num;
        }

        // 테이블 정의
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2; i<dp.length; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        System.out.println(dp[n-1]);

    }
}
