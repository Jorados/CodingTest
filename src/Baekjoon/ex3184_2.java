package Baekjoon;


import java.util.Scanner;

// 양
public class ex3184_2 {
    static int all_wolf;
    static int all_sheep;
    static int now_wolf;
    static int now_sheep;
    static int n,m;
    static char[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] ch;

    public static void DFS(int x,int y){
        if(map[x][y]=='v') now_wolf++;
        else if(map[x][y]=='o') now_sheep++;

        ch[x][y]=true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]!='#' && !ch[nx][ny]){
                ch[nx][ny]=true;
                DFS(nx,ny);
            }
        }
    }

    public static void solution(){
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                if(map[i][j]=='.' || map[i][j]=='v' || map[i][j]=='o'){
                    if(!ch[i][j]){
                        DFS(i,j);
                        if(now_sheep > now_wolf){
                            all_sheep += now_sheep;
                        }
                        else all_wolf += now_wolf;
                    }
                }
                now_wolf=0;
                now_sheep=0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        map = new char[n][m];
        for(int i=0; i<n; i++){
            String line = sc.next();
            for(int j=0; j<m; j++){
                map[i][j] = line.charAt(j);
            }
        }
        ch = new boolean[n][m];
        solution();
        System.out.println(all_sheep + " " + all_wolf);
    }
}
