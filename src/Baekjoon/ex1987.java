package Baekjoon;

import java.util.Scanner;

//백준 - 알파벳
public class ex1987 {
    static int n,m;
    static int answer=0;
    static int[] dx={0,1,0,-1};
    static int[] dy={-1,0,1,0};

    public static void DFS(int x, int y){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        String[][] str = new String[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                str[i][j] = sc.next();
            }
        }

        DFS(0,0);

    }
}
