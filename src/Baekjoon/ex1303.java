package Baekjoon;


import java.util.Scanner;

// 전쟁 - 전투 / DFS
public class ex1303 {
    static int n,m;
    static int count=0;
    static String str="";
    static char[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int white=0,blue=0;
    static boolean[][] ch;

    public static void DFS_W(int x,int y){
        ch[x][y]=true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]=='W' && !ch[nx][ny]){
                count++;
                DFS_W(nx,ny);
            }
        }
    }
    public static void DFS_B(int x,int y){
        ch[x][y]=true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]=='B' && !ch[nx][ny] ){
                count++;
                DFS_B(nx,ny);
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]=='W' && !ch[i][j]){
                    count=1;
                    DFS_W(i,j);
                    white += count * count;
                    count=0;
                }
                else if(map[i][j]=='B' && !ch[i][j]){
                    count=1;
                    DFS_B(i,j);
                    blue += count * count;
                    count=0;
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
            str = sc.next();
            for(int j=0; j<m; j++){
                map[i][j] =(str.charAt(j));
            }
        }
        ch = new boolean[n][m];
        solution();
        System.out.println(white + " " + blue);
    }
}
