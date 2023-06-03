package Baekjoon;


import java.util.Scanner;

// BABBA - S5 - DP
public class ex9652 {

    static int n;
    static int[][] dp = new int[2][46];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        // 규칙 : A -> B , B -> AB
        // 0 -> A
        // 1 -> B
        // 2 -> BA
        // 3 -> BAB
        // 4 -> BABBA
        // 5 -> BABBABAB

        // [0][n] : A
        // [1][n] : B

        // 한번 눌렀을때 - B 1개
        dp[1][1] = 1;
        // 두번 눌렀을때 - A,B 각 1개
        dp[0][2] = 1;
        dp[1][2] = 1;

        for(int i=3; i<dp[0].length; i++){
            dp[0][i] = dp[0][i-2] + dp[0][i-1];
            dp[1][i] = dp[1][i-2] + dp[1][i-1];
        }
        System.out.println(dp[0][n] + " " + dp[1][n]);

    }

}

