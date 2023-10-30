package Baekjoon;


import java.util.Scanner;

// 미로 탈출하기
public class ex17090 {
    static int n,m,answer=0;
    static char[][] map;
    static boolean[][] ch;
    public static boolean DFS(int x,int y){
        boolean flag = false;
        if(x<0 || x>=n || y<0 || y>=m) return true;

        if(map[x][y]=='T') return true;
        else if(map[x][y]=='F') return false;

        if(ch[x][y]) return false;
        ch[x][y] = true;

        if (map[x][y]=='U') flag = DFS(x-1,y);
        else if (map[x][y]=='R') flag = DFS(x,y+1);
        else if (map[x][y]=='L') flag = DFS(x,y-1);
        else if (map[x][y]=='D') flag = DFS(x+1,y);

        map[x][y] = flag ?'T':'F';
        return flag;
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(DFS(i,j)) answer++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new char[n][m];
        ch = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0;  j<m; j++){
                map[i][j] = str.charAt(j);
            }
        }
        solution();
        System.out.println(answer);
    }
}
