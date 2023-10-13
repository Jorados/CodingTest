package CodingTest.Simulation;


import java.util.Scanner;

// 청소
public class ex2 {

    // dx,dy를 로봇청소기 방향에 맞게 해준다음에 그게 순서대로 반복되게 해주면된다.
    static int n;
    static int[][] map;
    static int k,cnt=0;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[] answer = new int[2];

    public static void DFS(int x,int y){
        int d=0; // 내 방향 -> 상 우 하 좌
        while(cnt<k){
            cnt++;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx<0 || nx>=n || ny<0 || ny>=n || map[nx][ny]==1){
                d = (d+1) % 4;
                continue;
            }
            x = nx;
            y = ny;
        }
        answer[0] = x;
        answer[1] = y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         map = new int[n][n];
         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 map[i][j] = sc.nextInt();
             }
         }

         k = sc.nextInt();
         DFS(0,0);
        System.out.println(answer[0] + " " + answer[1]);
    }
}
