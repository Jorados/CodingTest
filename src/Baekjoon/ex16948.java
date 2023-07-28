package Baekjoon;


import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 데스나이트 - S1 - BFS

class Point4{
    int x;
    int y;
    public Point4(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex16948 {
    static int[] dx = {-2,-2,0,0,2,2};
    static int[] dy = {-1,1,-2,2,-1,1};
    static int[][] board;
    static int[][] dis;
    static int n,x1,y1,x2,y2;

    public static void BFS(int x,int y){
        Queue<Point4> Q = new LinkedList<>();
        Q.offer(new Point4(x,y));

        while(!Q.isEmpty()){
            Point4 poll = Q.poll();
            for(int i=0; i<6; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==0){
                    board[nx][ny]=1;
                    Q.offer(new Point4(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        board = new int[n][n];
        dis = new int[n][n];

        board[x1][y1]=1;
        BFS(x1,y1);
        if(dis[x2][y2]>0)System.out.println(dis[x2][y2]);
        else System.out.println(-1);
    }
}
