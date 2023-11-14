package Baekjoon;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 보물섬
class Point12 {
    int x;
    int y;
    public Point12(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class ex2589 {
    static int n,m;
    static char[][] map;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static int answer=0;
    public static void BFS(int x,int y,int[][] dis,boolean[][] ch){
        ch[x][y]=true;
        dis[x][y]=0;
        Queue<Point12> Q = new LinkedList<>();
        Q.offer(new Point12(x,y));

        while (!Q.isEmpty()){
            Point12 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny] && map[nx][ny]=='L'){
                    ch[nx][ny]=true;
                    Q.offer(new Point12(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                answer = Math.max(answer,dis[i][j]);
            }
        }
    }

    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int[][] dis = new int[n][m];
                boolean[][] ch = new boolean[n][m];
                if(map[i][j]=='L') BFS(i,j,dis,ch);
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new char[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                map[i][j]=str.charAt(j);
            }
        }

        // 육지(L)에 보물 2개를 최대한 멀리 숨겨하야고 이 거리사이의 최단거리를 구해야한다.
        // 각 육지의 좌표에서 갈 수 있는 최대한 먼 거리를 dis에 기록하고
        // 가장 큰 dis[i][j]값이 answer 이다.
        solution();
    }
}
