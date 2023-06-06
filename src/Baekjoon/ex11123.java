package Baekjoon;


import java.util.Scanner;

// 양 한마리... 양 두마리... - DFS - S2
public class ex11123 {

    static int test;
    static int n,m;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static char[][] board;
    static int cnt=0;

    public static void DFS(int x,int y){
        board[x][y]='0';
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]=='#'){
                DFS(nx,ny);
            }
        }
    }

    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]=='#'){
                    cnt++;
                    DFS(i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();

        while(test-- >0){
            n = sc.nextInt();
            m = sc.nextInt();

            board = new char[n][m];
            for(int i=0; i<n; i++){
                String s = sc.next();
                for(int j=0; j<m; j++){
                    board[i][j] = s.charAt(j);
                }
            }

            solution();
            System.out.println(cnt);
            cnt=0;
        }
    }
}
