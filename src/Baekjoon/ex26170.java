package Baekjoon;


import java.util.Scanner;

// 사과 빨리 먹기
public class ex26170 {
    static int[][] map;
    static boolean[][] ch;
    static int sX,sY;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int answer=Integer.MAX_VALUE;
    static boolean flag = false;
    public static void DFS(int cnt,int L,int x,int y){
        if(cnt==3){
            flag = true;
            answer = Math.min(answer,L);
        }

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<5 && ny>=0 && ny<5 && map[nx][ny]!=-1 && !ch[nx][ny]){
                if(map[nx][ny]==1) cnt++;
                ch[nx][ny]=true;
                DFS(cnt,L+1,nx,ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        map = new int[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                map[i][j] = sc.nextInt();
            }
        }

        sX = sc.nextInt();
        sY = sc.nextInt();

        ch = new boolean[5][5];

        ch[sX][sY]=true;
        DFS(0,0,sX,sY);
        if(!flag) System.out.println(-1);
        else  System.out.println(answer);
    }
}
