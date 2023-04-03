package Beakjoon_zaqabi;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로탐색(최단거리) - S1
class Point{
    public int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class ex2178 {

    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static int n,m,answer=Integer.MAX_VALUE,cnt=1;
    static int[][] board;
    static int[][] ch; //뒤로 안돌아가기위한 체크배열

    public static void BFS(int x, int y){
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x,y));
        board[x][y]=0;
        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==1){
                    board[nx][ny]=0;
                    Q.offer(new Point(nx,ny));
                    ch[nx][ny]=ch[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        board = new int[n][m];
        ch = new int[n][m];

        for(int i=0;i<n;i++) {
            String input = sc.next();
            for(int j=0;j<m;j++) {
                board[i][j] = input.charAt(j) - '0';
            }
        }

        BFS(0,0);
        System.out.println(ch[n-1][m-1]+1);
    }
}
