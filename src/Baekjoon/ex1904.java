package Baekjoon;


import java.util.Scanner;

public class ex1904 {

    public static int[] dp = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        // -1 로 초기화
        for(int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        // 계산되어있지 않는 부분만 호출 , 메모이제이션
        // fibo(4)를 호출하게 되면 fibo(2)가 2번호출되는것을 1번만 호출하기 위함.
        if(dp[n] == -1) {
            dp[n] = (fibo(n - 1) + fibo((n - 2))) % 15746;
        }
        return dp[n];
    }

}