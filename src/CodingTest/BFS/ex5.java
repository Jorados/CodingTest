package CodingTest.BFS;


import java.util.*;

// BFS - 집을 짓자
class Point2{
    int x;
    int y;
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class ex5 {
    static int n,sum=0,cnt=0;
    static int[][] map;
    static int answer=Integer.MAX_VALUE;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean flag = false;
    public static void BFS(int x,int y,int[][] dis,boolean[][] ch){
        Queue<Point2> Q = new LinkedList<>();
        Q.offer(new Point2(x,y));

        while(!Q.isEmpty()){
            Point2 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && !ch[nx][ny]){
                    if(map[nx][ny]!=2 && map[nx][ny]!=1){
                        ch[nx][ny]=true;
                        Q.offer(new Point2(nx,ny));
                        dis[nx][ny] = dis[poll.x][poll.y] + 1;
                    }
                    if(map[nx][ny]==1){
                        ch[nx][ny]=true;
                        dis[nx][ny] = dis[poll.x][poll.y] + 1;
                    }
                }
            }
        }

        int cnt2=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1 && dis[i][j]>0){
                    cnt2++;
                    sum+=dis[i][j];
                }
            }
        }

        if(cnt2==cnt) flag=true;
    }

    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==0){
                    int[][] dis = new int[n][n];
                    boolean[][] ch = new boolean[n][n];
                    BFS(i,j,dis,ch);
                    if(flag) answer = Math.min(answer,sum);
                    flag = false;
                    sum = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
                if(map[i][j]==1) cnt++;
            }
        }

        solution();
        if(answer==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer);
    }
}
