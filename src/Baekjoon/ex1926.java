package Baekjoon;


import java.util.Scanner;

// 그림 - S1
public class ex1926 {
    static int n,m,cnt=0,size=0,answer=0;
    static int[][] board;

    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    public static void DFS(int x,int y,int[][] board){
        board[x][y]=0;
        size++;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==1){
                DFS(nx,ny,board);
            }
        }
    }
    public static void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==1){
                    cnt++;
                    DFS(i,j,board);
                    answer = Math.max(answer,size);
                    size=0;
                }
            }
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
        solution(board);
        System.out.println(cnt);
        System.out.println(answer);

    }
}
