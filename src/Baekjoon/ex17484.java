package Baekjoon;


import java.util.Scanner;

// 진우의 달 여행(small) --> DP 개어려움..
public class ex17484 {

    static int n,m;
    static int[][] board;
    static int answer=0;
    public static void solution(){

        int num=0;
        // 다이나믹
        for(int i=0; i<m; i++){
            num = Math.min(board[0][0],board[0][i]);
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j] = sc.nextInt();
            }
        }

        solution();
    }
}
