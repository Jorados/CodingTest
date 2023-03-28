package Baekjoon;


import java.util.Scanner;

// 백준 - 현수막(DFS) - S1
public class ex14716 {

    static int n,m,answer=0;
    static int[][] board;

    //상,하,좌,우,대각선
    static int[] dx={0,1,1,1,0,-1,-1,-1};
    static int[] dy={-1,-1,0,1,1,1,0,-1};

    public static void DFS(int x,int y){
        board[x][y]=0;
        for(int i=0; i<8; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==1){
                DFS(nx,ny);
            }
        }
    }

    public static void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==1){
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

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j]=sc.nextInt();
            }
        }
        solution(board);
        System.out.println(answer);
    }
}
