package Practice08;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// BFS - 08 - 11

class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class ex0811 {
    static int[][] board = new int[7][7];
    static int[][] dis = new int[7][7];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] ch = new boolean[7][7];

    static Queue<Point> q = new LinkedList<>();

    public static void BFS(int x,int y){
        q.offer(new Point(x,y));

        while(!q.isEmpty()){
            Point poll = q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && board[nx][ny]==0 && !ch[nx][ny]){
                    ch[nx][ny]=true;
                    q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                board[i][j] = sc.nextInt();
            }
        }

        q.offer(new Point(0,0));
        ch[0][0]=true;
        BFS(0,0);
        System.out.println(dis[6][6]);
    }
}
