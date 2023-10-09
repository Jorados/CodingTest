package CodingTest.Graph;


import javax.security.sasl.SaslClient;
import java.util.Scanner;

//// 방향 바꾸기
//// 이 문제 그냥 DFS로 체크배열 해서 화살표 따라간 정보를 그대로 dis나 map에 알아볼수있게하고
//// 경로 중에서 하나 바꿔서 최소로 가는 방식을 찾자.
public class ex4 {
    static int n,m,answer=0;
    static int[][] map;
    static boolean[][] ch;
    public static void DFS(int x,int y){
        int nx;
        int ny;
        if(map[x][y] == 1){
            nx = x+1;
            ny = y;
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny]){
                ch[nx][ny]=true;
                DFS(nx,ny);
            }
        }
        else if(map[x][y] == 2){
            nx = x-1;
            ny = y;
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny]){
                ch[nx][ny]=true;
                DFS(nx,ny);
            }
        }
        else if(map[x][y] == 3){
            nx = x-1;
            ny = y;
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny]){
                ch[nx][ny]=true;
                DFS(nx,ny);
            }
        }
        else if(map[x][y] == 3){
            nx = x-1;
            ny = y;
            if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny]){
                ch[nx][ny]=true;
                DFS(nx,ny);
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
                map[i][j]= sc.nextInt();
            }
        }
        ch = new boolean[n][m];
        ch[0][0]=true;
        DFS(0,0);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }
}
