package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 쉬운 최단거리 - BFS

class Point3{
    int x;
    int y;
    public Point3(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex14940 {
    static int n,m;
    static int[][] dis;
    static int[][] board;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};

    public static void BFS(int x,int y){
        Queue<Point3> Q = new LinkedList<>();
        Q.offer(new Point3(x,y));
        board[x][y]=0;
        while(!Q.isEmpty()){
            Point3 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]!=0){
                    board[nx][ny]=0;
                    Q.offer(new Point3(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        m =sc.nextInt();

        board = new int[n][m];
        dis = new int[n][m];

        int sx=0,sy=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j]==2){
                    sx=i;
                    sy=j;
                }
            }
        }

        BFS(sx,sy);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]!=0 && dis[i][j]==0) System.out.print(-1 + " ");
                else System.out.print(dis[i][j] + " ");
            }
            System.out.println();
        }
    }
}
