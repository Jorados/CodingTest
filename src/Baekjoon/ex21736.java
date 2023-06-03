package Baekjoon;


import java.util.Scanner;

// 헌내기는 친구가 필요해 - S2 - DFS
public class ex21736 {
    static int n,m;
    static char[][] board;
    static boolean[][] ch;
    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
    static int cnt=0;
    public static void DFS(int x,int y){
        ch[x][y]=true;
        if(board[x][y]=='P') cnt++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny]){
                if(board[nx][ny]!='X') DFS(nx,ny);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        board = new char[n][m];
        ch = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                board[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]=='I') {
                    DFS(i,j);
                }
            }
        }
        if(cnt==0) System.out.println("TT");
        else System.out.println(cnt);
    }
}
