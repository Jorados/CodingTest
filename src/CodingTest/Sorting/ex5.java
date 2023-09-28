package CodingTest.Sorting;


import java.util.*;
import java.util.Scanner;

// 모임 장소 -> BFS 문제같음

class Point6{
    int x;
    int y;
    public Point6(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex5 {
    static int n;
    static int[][] map;
    static int answer=Integer.MAX_VALUE,cnt=0;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void BFS(int x, int y,boolean[][] ch,int[][] dis){
        ch[x][y]=true;
        Queue<Point6> Q = new LinkedList<>();
        Q.offer(new Point6(x,y));

        while(!Q.isEmpty()){
            Point6 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && !ch[nx][ny]){
                    Q.offer(new Point6(nx,ny));
                    ch[nx][ny]=true;
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }

        // 여기서 각 1에 저장된 거리를 sum으로 합치자.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1){
                    cnt += dis[i][j];
                }
            }
        }

    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean[][] ch = new boolean[n][n];
                int[][] dis = new int[n][n];
                if(map[i][j]==0){
                    BFS(i,j,ch,dis);
                    answer = Math.min(answer,cnt);
                    cnt=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n =sc.nextInt();
        map = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        solution();
        System.out.println(answer);
    }
}
