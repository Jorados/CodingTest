package Baekjoon;

import java.util.*;
// DFS
public class ex30702 {

    static int n;
    static int m;
    static char[][] map1;
    static char[][] map2;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean flag = false;
    static String answer="";
    public static void DFS(int x,int y,boolean[][] ch,char aCtr, char bCtr){
        map1[x][y]=bCtr;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny] && map1[nx][ny]==aCtr){
                ch[nx][ny]=true;
                map1[nx][ny]=bCtr;
                DFS(nx,ny,ch,aCtr,bCtr);
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                boolean[][] ch = new boolean[n][m];
                if(map1[i][j]!=map2[i][j]){
                    ch[i][j]=true;
                    DFS(i,j,ch,map1[i][j],map2[i][j]);
                }
            }
        }

        // 마지막 map1, map2 일치 불일치 확인 작업
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map1[i][j] != map2[i][j]) flag = true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map1 = new char[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                map1[i][j] = str.charAt(j);
            }
        }

        map2 = new char[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                map2[i][j] = str.charAt(j);
            }
        }

        // map1의 색을 바꿔서 map2처럼 바꿀수있는지 없는지?
        solution();
        if(flag) answer = "NO";
        else answer="YES";

        System.out.println(answer);
    }
}
