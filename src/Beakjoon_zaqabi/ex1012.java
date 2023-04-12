package Beakjoon_zaqabi;


import java.util.Scanner;

// 유기농 배추 -
public class ex1012 {

    static int n; //테스트 개수
    static int a,b,c; // 가로,세로,배추 개수
    static int answer=0;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    public static void DFS(int x,int y,int[][] board){
        board[x][y]=0;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<a && ny>=0 && ny<b && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny,board);
            }
        }
    }
    public static void solution(int[][] board){
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(board[i][j]==1){
                    answer++;
                    DFS(i,j,board);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int[][] board = new int[a][b];

            for(int j=0; j<c; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                board[x][y]=1;
            }

            solution(board);
            System.out.println(answer);
            answer=0;
        }
    }
}
