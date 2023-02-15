package DFS_BFS;

import java.util.Scanner;

//DFS로 미로탐색 풀기
public class ex10 {
    static int[][] board;
    static int answer=0;
    static int[] dx={0,1,0,-1};
    static int[] dy={-1,0,1,0};

    public static void DFS(int x , int y){
        if(x==6 && y==6) answer++;
        else{
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && nx<=6 && ny>=0 && ny<=6 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    DFS(nx,ny);
                    board[nx][ny]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[7][7];

        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                board[i][j]=sc.nextInt();
            }
        }
        board[0][0]=1;

        DFS(0,0);
        System.out.println(answer);
    }
}
