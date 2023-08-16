package Baekjoon;

import java.util.Scanner;

// 양 - DFS
public class ex3184 {
    static int n,m;
    static char[][] map;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static int answerO = 0 , answerV=0;
    static int nowO=0;
    static int nowV=0;

    public static void DFS(int x,int y){
        if(map[x][y]=='o') nowO++;
        else if(map[x][y]=='v') nowV++;

        map[x][y]='#';
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]!='#'){
                DFS(nx,ny);
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]=='.' || map[i][j]=='v' || map[i][j]=='o'){
                    DFS(i,j);
                    if(nowO > nowV){
                        answerO += nowO;
                    }
                    else answerV += nowV;
                }
                nowO=0;
                nowV=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new char[n][m];
        for(int i=0; i<n; i++){
            char[] str = sc.next().toCharArray();
            for(int j=0; j<m; j++){
                map[i][j] = str[j];
            }
        }

        solution();
        System.out.println(answerO + " " + answerV);
    }
}
