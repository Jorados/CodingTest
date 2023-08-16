package Practice08;

import java.util.Scanner;

// 섬나라 아일랜드
public class ex0813 {
    static int[][] board;
    static int n,answer=0;
    static int[] dx={0,1,1,1,0,-1,-1,-1};
    static int[] dy={-1,-1,0,1,1,1,0,-1};


    public static void DFS(int x,int y){
        board[x][y]=0;
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                DFS(nx,ny);
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
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
        board = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        solution();
        System.out.println(answer);
    }


}
