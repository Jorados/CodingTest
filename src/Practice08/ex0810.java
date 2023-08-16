package Practice08;


import java.util.Scanner;

// 8 - 10
public class ex0810 {
    static int[][] board = new int[7][7];
    static boolean[][] ch = new boolean[7][7];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int answer=0;
    public static void DFS(int x,int y){
        if(x==6 && y==6) answer++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<7 && ny>=0 && ny<7 && !ch[nx][ny] && board[nx][ny]==0){
                ch[nx][ny]=true;
                DFS(nx,ny);
                ch[nx][ny]=false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                board[i][j] = sc.nextInt();
            }
        }
        ch[0][0]=true;
        DFS(0,0);
        System.out.println(answer);
    }
}
