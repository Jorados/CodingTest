package CodingTest.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 숲속의 기사 -> BFS로 딸기까지의 거리를 구하고, BFS로 기사(3)에게 전달하는 최소 일수
public class ex6 {
    static int n;
    static int m;
    static int[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    static int sx2=0,sy2=0;
    public static int BFS1(int x,int y,boolean[][] ch,int[][] dis){
        // 여기서는 딸기까지의 최단거리의 좌표를 뱉을거임.
        Queue<Point2> Q = new LinkedList<>();
        Q.offer(new Point2(x,y));

        while(!Q.isEmpty()){
            Point2 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]!=1){
                    if(!ch[nx][ny]){
                        ch[nx][ny]=true;
                        dis[nx][ny] = dis[poll.x][poll.y] + 1;
                        Q.offer(new Point2(nx,ny));
                    }
                }
            }
        }

        int answer=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==4 && dis[i][j]<answer){
                    answer = dis[i][j];
                    sx2=i;
                    sy2=j;
                }
            }
        }
        return answer;
    }

    public static int BFS2(int x,int y,boolean[][] ch,int[][] dis){
        ch[x][y]=true;
        Queue<Point2> Q = new LinkedList<>();
        Q.offer(new Point2(x,y));

        while(!Q.isEmpty()){
            Point2 poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]!=1){
                    if(!ch[nx][ny]){
                        ch[nx][ny]=true;
                        dis[nx][ny] = dis[poll.x][poll.y] + 1;
                        Q.offer(new Point2(nx,ny));
                    }
                }
            }
        }

        int answer=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==3 && dis[i][j]<answer){
                    answer = dis[i][j];
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];

        int sx=0,sy=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j]=sc.nextInt();
                if(map[i][j]==2){
                    sx = i;
                    sy = j;
                }
            }
        }
        boolean[][] ch = new boolean[n][m];
        int[][] dis = new int[n][m];
        int FistDis = BFS1(sx, sy, ch, dis); //딸기를 챙긴 최단거리 위치

        boolean[][] ch2 = new boolean[n][m];
        int[][] dis2 = new int[n][m];
        int LastDis = BFS2(sx2,sy2,ch2,dis2); //기사 까지의 최단거리
        System.out.println(FistDis + LastDis);

    }
}
