package Baekjoon;


import java.util.Scanner;

// 파스칼의 삼각형 - S5
public class ex16395 {

    static int L;
    static int value;
    static long dp[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        L = sc.nextInt();
        value = sc.nextInt();

        dp = new long[31][31];

        //테이블 선언
        dp[1][1]=1;
        dp[2][1]=1; dp[2][2]=1;
        dp[3][1]=1; dp[3][2]=2; dp[3][3]=1;

        //점화식 -> DP
        for(int i=4; i<dp.length; i++){
            for(int j=1; j<dp.length; j++){
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }
        System.out.println(dp[L][value]);
    }
}
