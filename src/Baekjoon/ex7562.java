package Baekjoon;


// 나이트의 이동 - S1 - BFS

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class ex7562 {
    static int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
    static int[] dy = { -2, -1, 1, 2, 2, 1, -1, -2 };
    static int[][] dis;
    static boolean[][] ch;
    static int T;


    public static void BFS(ArrayList<Point> arr , int n, int[][] dis, boolean[][] ch){
        Queue<Point> Q = new LinkedList<>();
        Q.offer(arr.get(0));

        ch[arr.get(0).x][arr.get(0).y] = true;

        while(!Q.isEmpty()){
            Point poll = Q.poll();

            for(int i=0; i<8; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && !ch[nx][ny]){
                    ch[nx][ny] = true;
                    Q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();

            dis = new int[n][n];
            ch = new boolean[n][n];

            ArrayList<Point> arr = new ArrayList<>();
            for(int i=0; i<2; i++){
                int st = sc.nextInt();
                int et = sc.nextInt();

                arr.add(new Point(st,et));
                // arr.get(0) -> 시작점
                // arr.get(1) -> 끝점
            }

            BFS(arr,n,dis,ch);
            System.out.println(dis[arr.get(1).x][arr.get(1).y]);
        }
    }
}
