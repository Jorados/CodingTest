package CodingTest.Graph;


import java.util.*;

// 공 굴리기

class Edge{
    int x;
    int y;
    public Edge(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex5 {

    static int n,m;
    static int[][] map;
    static int[] s = new int[2];
    static int[] e = new int[2];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[][] dis;
    static boolean[][] ch;

    public static void BFS(int x,int y){
        Queue<Edge> Q = new LinkedList<>();
        Q.offer(new Edge(x,y));

        while(!Q.isEmpty()){
            Edge poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny] && map[nx][ny]==0){
                    ch[nx][ny]=true;
                    Q.offer(new Edge(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }

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

        s[0] = sc.nextInt();
        s[1] = sc.nextInt();

        e[0] = sc.nextInt();
        e[1] = sc.nextInt();

        dis = new int[n][m];
        ch = new boolean[n][m];

        ch[s[0]][s[1]]=true;
        BFS(s[0],s[1]);

//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(dis[i][j] + " ");
//            }
//            System.out.println();
//        }

        if(dis[e[0]][e[1]] == 0) System.out.println(-1);
        else System.out.println(dis[e[0]][e[1]]);
    }
}
