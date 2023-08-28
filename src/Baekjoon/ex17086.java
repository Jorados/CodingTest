package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 아기상어 - BFS
class Point5{
    int x;
    int y;
    public Point5(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
public class ex17086 {
    static int n,m,answer=Integer.MIN_VALUE;
    static int[][] board;
    static int[] dx={0,1,1,1,0,-1,-1,-1};
    static int[] dy={1,1,0,-1,-1,-1,0,1};
    static int[][] dis;
    static boolean[][] ch;
    public static void BFS(int x,int y,int[][] dis,boolean[][] ch){
        Queue<Point5> Q = new LinkedList<>();
        Q.offer(new Point5(x,y));
        ch[x][y]=true;

        while(!Q.isEmpty()){
            Point5 poll = Q.poll();

            if(board[poll.x][poll.y]==1){
                answer = Math.max(answer,dis[poll.x][poll.y]);
                break;
            }

            for(int i=0; i<8; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny]){
                    ch[nx][ny]=true;
                    Q.offer(new Point5(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==0){
                    dis = new int[n][m];
                    ch = new boolean[n][m];
                    BFS(i,j,dis,ch);
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
                board[i][j] = sc.nextInt();
            }
        }
        solution();
        System.out.println(answer);
    }
}
