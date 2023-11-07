package Baekjoon;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
class Gel implements Comparable<Gel>{
    int x;
    int y;
    int cost;
    public Gel(int x,int y,int cost){
        this.x = x;
        this.y = y;
        this.cost  = cost;
    }

    @Override
    public int compareTo(Gel o) {
        return this.cost - o.cost;
    }
}
public class ex4485 {
    static int n;
    static int[][] map;
    static int[][] dis;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static int BFS(){
        PriorityQueue<Gel> pq = new PriorityQueue<>();
        pq.offer(new Gel(0,0,map[0][0]));
        dis[0][0]=map[0][0];

        while (!pq.isEmpty()){
            Gel poll = pq.poll();
            int x = poll.x;
            int y = poll.y;
            int cost = poll.cost;

            // 끝에 도달하면
            if(x == n-1 && y == n-1) {
                return cost;
            }

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && cost + map[nx][ny] < dis[nx][ny]){
                    dis[nx][ny] = map[nx][ny] + cost;
                    pq.offer(new Gel(nx,ny,map[nx][ny]+cost));
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }

        dis = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dis[i],Integer.MAX_VALUE);
        }

        int bfs = BFS();
        System.out.println(bfs);
    }
}
