package Baekjoon;


import java.util.Scanner;

// 섬의 개수
public class ex4963 {

    static int n,m;
    static int[][] map;
    static int[] dx={0, 0, -1 ,1, -1, 1, -1, 1};
    static int[] dy={-1, 1, 0, 0, 1, 1, -1, -1};

    public static void DFS(int x,int y,int[][] map){
        map[x][y]=0;
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<m && ny>=0 && ny<n && map[nx][ny]==1){
                DFS(nx,ny,map);
            }
        }
    }

    public static int solution(int[][] map){
        int answer=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1){
                    answer++;
                    DFS(i,j,map);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(map));
    }
}
