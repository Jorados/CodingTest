package Baekjoon;


import java.util.Scanner;

// 1로 만들기
public class ex1463 {
    static int answer=0;

    public static int solution(int x){
        // 1이 되는 경우의 수를 구해야한다.
        // 재귀 혹은 dp로 푸는 문제

        //dp[i] = 정수가 i를 1로 만들때 연산을 하는 횟수의 최솟값
        int dp[] = new int[x + 1];

        dp[0]=dp[1]=0;

        for(int i=2; i<=x; i++){
            dp[i]=dp[i-1]+1; //1을 뺀경우 : a
            if(i%2==0) dp[i]=Math.min(dp[i],dp[i/2]+1); // a와 2로 나눈값 중 최솟값 : b
            if(i%3==0) dp[i]=Math.min(dp[i],dp[i/3]+1); // b와 3으로 나눈값 중 최솟값
        }
        return dp[x];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));

    }
}
