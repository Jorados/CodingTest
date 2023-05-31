package Baekjoon;


import java.util.Scanner;

// 음식물 피하기 - S1 - DFS
public class ex1743 {
    static int n,m;
    static int trash;
    static int[][] board;
    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
    static int size=0;
    static int answer=Integer.MIN_VALUE;

    public static void DFS(int x,int y){
        board[x][y]=0;
        size+=1;

        for(int i=0; i<4; i++){
           int nx = x + dx[i];
           int ny = y + dy[i];
           if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==1){
               DFS(nx,ny);
           }
        }
    }

    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==1){
                    size=0;
                    DFS(i,j);
                    answer = Math.max(answer,size);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        trash = sc.nextInt();
        board = new int[n][m];

        for(int i=0; i<trash; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = x-1;
            int b = y-1;
            board[a][b]=1;
        }

        solution();
        System.out.println(answer);


    }
}
