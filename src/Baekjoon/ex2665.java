package Baekjoon;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로만들기
//
class Room2{
    int x;
    int y;

    public Room2(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class ex2665 {
    static int n;
    static int[][] map;
    static int[][] dis;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void BFS(){
        Queue<Room2> Q = new LinkedList<>();
        Q.offer(new Room2(0,0));
        dis[0][0]=0; // 거리

        while (!Q.isEmpty()){
            Room2 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && dis[poll.x][poll.y] < dis[nx][ny]){
                    if(map[nx][ny]==1) dis[nx][ny] = dis[poll.x][poll.y];
                    else dis[nx][ny] = dis[poll.x][poll.y] + 1;
                    Q.offer(new Room2(nx,ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        map = new int[n][n];
        dis = new int[n][n];
        for(int i=0; i<n; i++){
            String str = sc.next();
            char[] ctr = str.toCharArray();
            for(int j=0; j<n; j++){
                map[i][j] = Integer.valueOf(ctr[j] - '0');
                dis[i][j] = Integer.MAX_VALUE;
            }
        }

        //dis = new int[n][n];
        //Arrays.fill(dis,Integer.MAX_VALUE);
        BFS();
        System.out.println(dis[n-1][n-1]);
    }
}
