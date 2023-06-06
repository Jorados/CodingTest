package Baekjoon;


import java.util.Scanner;

// 침투 - DFS - s2
public class ex13565 {
    static int n,m;
    static int board[][];
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static boolean flag;

    public static void DFS(int x,int y){
        if(x==n-1){
            flag=true;
            return;
        }
        board[x][y]=2;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
                DFS(nx,ny);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];
        for (int i=0; i<n; i++) {
            String temp = sc.next();
            for (int j=0; j<m; j++) {
                board[i][j]=temp.charAt(j)-'0';
            }
        }

        for(int i=0; i<m; i++){
            if(flag==true) break;
            if(board[0][i]==0){
                DFS(0,i);
            }
        }

        if(flag==true) System.out.println("YES");
        else System.out.println("NO");

    }
}
