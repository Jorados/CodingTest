package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토
//1 : 익은 토마토
//0 : 익지 않은 토마토
//-1: 토마토가 들어있지 않음
// 4방향으로 익은 토마토 인근에 있는 안익은 토마토는 하루가 지나면 익는다.
public class ex12 {

    static int[][] board;
    static int[][] ch;
    static int n,m,answer=0;
    static Queue<Point> Q = new LinkedList<>();
    static int[] dx={0,1,0,-1};
    static int[] dy={-1,0,1,0};

    public static void BFS(){
        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<m && ny>=0 && ny<n && board[nx][ny]==0){
                    board[nx][ny]=1;
                    Q.offer(new Point(nx,ny));
                    ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[m][n];
        ch = new int[m][n];
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j]==1) Q.offer(new Point(i,j));
            }
        }
        BFS();
        boolean flag = true;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==0) flag=false;
            }
        }
        //참이면
        if(flag){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    answer = Math.max(answer,ch[i][j]);
                }
            }
            System.out.println(answer);
        }
        //거짓이면
        else System.out.println(-1);
    }
}
