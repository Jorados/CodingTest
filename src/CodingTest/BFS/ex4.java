package CodingTest.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로의 최단거리 통로

class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex4 {
    static int answer=0;
    static int[][] map = new int[7][7];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[][] dis = new int[7][7];
    public static void BFS(int x,int y){
        Queue<Point> Q = new LinkedList<>();
        Q.add(new Point(x,y));

        while(!Q.isEmpty()){
            Point poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && map[nx][ny]==0){
                    map[nx][ny]=2;
                    Q.add(new Point(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                map[i][j] = sc.nextInt();
            }
        }
        BFS(0,0);
        if(dis[6][6]==0) System.out.println(-1);
        else System.out.println(dis[6][6]);
    }
}
