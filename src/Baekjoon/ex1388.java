package Baekjoon;


import java.util.Scanner;

// 바닥 장식
public class ex1388 {

    static int n;
    static int m;
    static char[][] map;
    static int answer = 0;


    public static void DFS1(int x, int y) {

    }

    public static void solution() {

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        solution();
        System.out.println(answer);
    }

}
