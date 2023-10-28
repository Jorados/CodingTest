package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 연구소

class Science{
    int x;
    int y;
    public Science(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex14502 {

    static int n,m;
    static int[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int answer = Integer.MIN_VALUE;

    public static void solution(int L){
        if(L==3){
            BFS();
        }
        else{
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(map[i][j]==0){
                        map[i][j]=1;
                        solution(L+1);
                        map[i][j]=0;
                    }
                }
            }
        }
    }

    public static void BFS(){
        int[][] board = new int[n][m];
        Queue<Science> Q = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j] = map[i][j];
                if(board[i][j]==2){
                    Q.offer(new Science(i,j));
                }
            }
        }

        while (!Q.isEmpty()){
            Science poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
                    board[nx][ny]=2;
                    Q.offer(new Science(nx,ny));
                }
            }
        }

        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==0){
                    sum++;
                }
            }
        }

        answer = Math.max(answer,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }

        solution(0);
        System.out.println(answer);
    }
}
