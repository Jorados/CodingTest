package Baekjoon;

import java.util.Scanner;

public class ex3187 {

    static int n,m;
    static char[][] board;
    static boolean[][] ch;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static int wolf=0,sheep=0;
    static int all_wolf=0,all_sheep=0;

    public static void DFS(int x,int y){
        ch[x][y] = true;
        if(board[x][y]=='k') sheep++;
        else if(board[x][y]=='v') wolf++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny] && board[nx][ny]!='#'){
                DFS(nx,ny);
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]!='#' && !ch[i][j]){
                    wolf=0;
                    sheep=0;
                    DFS(i,j);
                    if (wolf >= sheep) all_sheep -= sheep;
                    else all_wolf -= wolf;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new char[n][m];
        ch = new boolean[n][m];

        for(int i=0; i<n; i++){
            char[] str = sc.next().toCharArray();
            for(int j=0; j<m; j++){
                board[i][j] = str[j];
                if(board[i][j]=='k') all_sheep++;
                else if(board[i][j]=='v') all_wolf++;
            }
        }
        solution();
        System.out.println(all_sheep + " " + all_wolf);
    }
}
