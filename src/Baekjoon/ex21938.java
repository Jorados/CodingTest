package Baekjoon;


import java.util.Scanner;

// 영상처리 - S2 - DFS
public class ex21938 {

    static int n,m;
    static int[][] board;
    static int average;
    static int answer=0;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static boolean visit[][];
    public static void DFS(int x,int y){
        visit[x][y]=true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]!=0 && !visit[nx][ny]){
                DFS(nx,ny);
            }
        }
    }

    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] >= average) board[i][j]=255;
                else board[i][j]=0;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==255 && !visit[i][j]){
                    answer++;
                    DFS(i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        visit = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int r = sc.nextInt();
                int g = sc.nextInt();
                int b = sc.nextInt();

                board[i][j]=(r+g+b)/3;
            }
        }
        average = sc.nextInt();

        solution();
        System.out.println(answer);
    }
}
