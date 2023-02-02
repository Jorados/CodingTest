package DFS_BFS;

import java.util.Scanner;

//섬나라 아일랜드
public class ex13 {
    static int n=0,answer=0;
    static int[][] board;
    static int[] dx={-1,-1,0,1,1,1,0,-1};
    static int[] dy={0,1,1,1,0,-1,-1,-1};
    public static void DFS(int x,int y,int[][] board) {
        for(int i=0; i<8; i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny,board);
            }
        }
    }

    public static void solution(int[][] board) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1) {
                    answer++;
                    DFS(i,j,board);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        solution(board);
        System.out.println(answer);
    }
}
