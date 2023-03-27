package Baekjoon;


import java.util.Scanner;

// 백준 - 체스판 다시 칠하기 - S4
public class ex1018 {

    public static int solution(String[] board,int n){
        int answer=0;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] board = new String[n];
        for(int i=0; i<n; i++){
            board[i] = sc.next();
        }
        System.out.println(solution(board,n));
    }
}
