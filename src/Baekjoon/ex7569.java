package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 토마토 - BFS - G5

class Point9{
    int x;
    int y;
    public Point9(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex7569 {

    static int n,m,h,answer=Integer.MIN_VALUE;
    static int[][] map;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static int[][] dis;
    static boolean flag = false;

    public static void BFS(int x,int y){
        Queue<Point9> Q = new LinkedList();
        Q.offer(new Point9(x,y));

        while (!Q.isEmpty()){
            Point9 poll = Q.poll();
            for(int i=0; i<4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<m*h && ny>=0 && ny<n && map[nx][ny]==0){
                    map[nx][ny]=1;
                    Q.offer(new Point9(nx,ny));
                    dis[nx][ny]=dis[poll.x][poll.y]+1;
                }
            }
        }

    }
    public static void solution(){
        for(int i=0; i<m*h; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1){
                    BFS(i,j);
                }
            }
        }


        // 다 돌리고 나서 안익은곳있는지 체크.
        for(int i=0; i<m*h; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==0){
                    flag = true;
                    break;
                }
                answer = Math.max(answer,dis[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 5
        m = sc.nextInt(); // 3
        h = sc.nextInt();
        map = new int[m*h][n];
        dis = new int[m*h][n];
        for(int i=0; i<m*h; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }

        solution();
        if(flag) System.out.println(-1);
        else System.out.println(answer);
    }
}
