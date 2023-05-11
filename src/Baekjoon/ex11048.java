package Baekjoon;


import java.util.Scanner;

// 이동하기 - ex11048
public class ex11048 {
    static int n,m;
    static int[][] board;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n+1][m+1];
        dp = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                board[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                dp[i][j] = Math.max(dp[i][j-1]+board[i][j],dp[i-1][j]+board[i][j]);
            }
        }
        System.out.println(dp[n][m]);

    }

}
