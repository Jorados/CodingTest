package CodingTest.Simulation;


import java.util.Scanner;

// 좌석 번호
public class ex4 {
    static int c,r,k;
    static int[] answer = new int[2];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    public static void solution(){
        map = new int[c][r];
        if(c*r < k) {
            System.out.println(answer[0] + " " + answer[1]);
            return;
        }

        // 4,0 부터 시작
        int x = 0;
        int y = 0;
        int d = 1;

        int cnt=1;
        while(cnt < k){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx<0 || nx>=c || ny<0 || ny>=r || map[nx][ny]!=0){
                d = (d+1)%4;
                continue;
            }
            map[nx][ny] = 2;
            x = nx;
            y = ny;
            cnt++;
        }
        answer[0] = x+1;
        answer[1] = y+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        r = sc.nextInt();
        k = sc.nextInt();
        solution();
        System.out.println(answer[0] + " " + answer[1]);
    }
}
