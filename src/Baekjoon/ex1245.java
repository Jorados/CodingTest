package Baekjoon;


import java.util.Scanner;

// 농장관리 - DFS - G5
public class ex1245 {

    static int n,m,answer=0;
    static int[][] board;
    static boolean[][] visit;
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    static int[] dy = {1,1,0,-1,-1,-1,0,1};
    static boolean flag = true;

    public static void DFS(int x,int y){
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m){
                if(board[x][y]<board[nx][ny]) flag = false;
                if(!visit[nx][ny] && board[x][y]==board[nx][ny]){
                    visit[nx][ny]=true;
                    DFS(nx,ny);
                }
            }
        }

    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visit[i][j]){
                    flag = true;
                    DFS(i,j);
                    if(flag) answer++;
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
                board[i][j] = sc.nextInt();
            }
        }

        solution();
        System.out.println(answer);
    }
}
