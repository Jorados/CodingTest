package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 바이러스

public class ex2606 {

    static int n,m;
    static int answer=0;
    static boolean[][] board;
    static boolean[] ch;

    public static void DFS(int v){
        answer++;
        ch[v]=true;
        for(int i=1; i<=n; i++){
            if( !ch[i] && board[v][i] ){
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        board = new boolean[n+1][n+1];
        ch = new boolean[n+1];
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            board[x][y] = true;
            board[y][x] = true;
        }
        DFS(1);
        System.out.println(answer-1);
    }

}
