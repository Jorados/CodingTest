package Baekjoon;


import java.util.Scanner;

// 항체 인식 - G5 - DFS
public class ex22352 {

    static int n,m;
    static int[][] board;
    static int[][] compare;
    static boolean flag=false;
    static String answer="YES";
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[] diffInfo = new int[4];


    public static void DFS(int x,int y,int before, int after){
        board[x][y]=after;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==before){
                DFS(nx,ny,before,after);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];
        compare = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                compare[i][j] = sc.nextInt();
                if(compare[i][j]!=board[i][j] && !flag){
                    flag=true;
                    diffInfo[0] = i;
                    diffInfo[1] = j;
                    diffInfo[2] = board[i][j];
                    diffInfo[3] = compare[i][j];
                }
            }
        }

        if(flag) DFS(diffInfo[0],diffInfo[1],diffInfo[2],diffInfo[3]);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]!=compare[i][j]) answer = "NO";
            }
        }
        System.out.println(answer);
    }
}
