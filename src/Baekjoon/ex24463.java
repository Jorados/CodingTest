package Baekjoon;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로 - G4
// 1. 각 입구 좌표를 찾자.
// 2. 최단거리를 찾아서 역순으로 추적 후 '.'는 '@' 로 변경

class Point11 {
    int x;
    int y;
    public Point11(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class ex24463 {
    static int n,m;
    static char[][] map;
    static int sX=-1,sY=-1,eX=0,eY=0;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static boolean[][] DFSch;
    static int[][] dis;
    public static void DFS(int x,int y){
        DFSch[x][y]=true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && dis[nx][ny]==(dis[x][y]-1) && !DFSch[nx][ny]) {
                DFSch[nx][ny] = true;
                DFS(nx, ny);
            }
        }
    }
    public static void BFS(int x,int y){
        boolean[][] ch = new boolean[n][m];
        Queue<Point11> Q = new LinkedList<>();
        Q.offer(new Point11(x,y));
        ch[x][y]=true;
        dis[x][y]=0;

        while (!Q.isEmpty()){
            Point11 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]=='.' && !ch[nx][ny]){
                    ch[nx][ny]=true;
                    Q.offer(new Point11(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (map[i][j] == '.' && (i == 0 || j == 0 || i == n - 1 || j == m - 1)) {
                    if (sX == -1) {
                        sX = i;
                        sY = j;
                    } else {
                        eX = i;
                        eY = j;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new char[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                map[i][j] = str.charAt(j);
            }
        }

        // 1. 좌표 찾기
        solution();

        // 2. 최단경로 찾기
        dis = new int[n][m];
        BFS(sX,sY);

        // 3. 역순으로 길 찾기
        DFSch = new boolean[n][m];
        DFS(eX,eY);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]=='.' && !DFSch[i][j]){
                    map[i][j] = '@';
                }
            }
        }

        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String line = "";
            for(int j=0; j<m; j++){
                line += map[i][j];
            }
            answer[i] = line;
            System.out.println(answer[i]);
        }

    }

}
