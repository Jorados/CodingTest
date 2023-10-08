package CodingTest.Graph;


import java.util.Scanner;

// 벽 허물기
// DFS로 진행. 그냥 벽 만나면 cnt++ 해주고
// 도착점에 도착하면 가장낮은 cnt를 저장해주자.
public class ex3 {

    static int n,m,answer=Integer.MAX_VALUE;
    static int[][] map;
    static boolean[][] ch;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void DFS(int x,int y,int cnt){
        if(x==n-1 && y==m-1){
            answer = Math.min(answer,cnt);
        }
        if(map[x][y]==1){
            cnt++;
        }

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny]){
                ch[nx][ny]=true;
                DFS(nx,ny,cnt);
                ch[nx][ny]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        ch = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }
        ch[0][0]=true;
        DFS(0,0,0);
        System.out.println(answer);
    }
}
