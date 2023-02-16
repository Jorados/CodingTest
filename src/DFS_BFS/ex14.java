package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//섬나라 아일랜드
//BFS
public class ex14 {
    static int[] dx={0,1,1,1,0,-1,-1,-1};
    static int[] dy={-1,-1,0,1,1,1,0,-1};
    static int[][] board;
    static int n,answer=0;

    static Queue<Point> Q = new LinkedList<>();
    public static void BFS(int x,int y,int[][] board){
        Q.offer(new Point(x,y));
        while(!Q.isEmpty()){
            Point poll = Q.poll();
            for(int i=0; i<8; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                    board[nx][ny]=0;
                    Q.offer(new Point(nx,ny));
                }
            }
        }
    }

    public static void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    BFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=sc.nextInt();
            }
        }
        solution(board);
        System.out.println(answer);
    }
}
