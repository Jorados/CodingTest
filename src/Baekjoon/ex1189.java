package Baekjoon;


import java.util.Scanner;

// 컴백홈 - S1 - DFS
public class ex1189 {

    static int n,m,dis;
    static char[][] board;
    static boolean[][] visit;
    static int answer=0;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void DFS(int x,int y,int L){
        if(x==0 && y==m-1){
            if(L==dis) answer++;
            return;
        }

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]!='T' && !visit[nx][ny]){
                visit[nx][ny] = true;
                DFS(nx,ny,L+1);
                visit[nx][ny] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        dis = sc.nextInt();
        visit = new boolean[n][m];
        board = new char[n][m];

        for(int i=0; i<n; i++){
            String s = sc.next();
            for(int j=0; j<m; j++){
                board[i][j] = s.charAt(j);
            }
        }
        visit[n-1][0]=true;
        DFS(n-1,0,1); // 도착지 board[0][m-1]
        System.out.println(answer);
    }
}
