package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 나의 인생에는 수학과 함께
public class ex17265 {

    static int n;
    static char[][] board;
    static int dx[] = {1, 0};
    static int dy[] = {0, 1};
    static ArrayList<Integer> nums = new ArrayList<>();
    static boolean visit[][];
    public static void DFS(int x,int y,int value){
        if(x==n-1 && y==n-1){
            nums.add(value);
            return;
        }

        visit[x][y]=true;
        for(int i=0; i<2; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && !visit[nx][ny]){
                if(board[x][y]=='+'){
                    DFS(nx,ny,value + (board[nx][ny]-'0'));
                } else if (board[x][y] == '-') {
                    DFS(nx,ny,value - (board[nx][ny]-'0'));
                }
                else if(board[x][y]=='*'){
                    DFS(nx,ny,value * (board[nx][ny]-'0'));
                }
                else {
                    DFS(nx,ny,value);
                }
            }
        }
        visit[x][y]=false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new char[n][n];
        visit = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.next().charAt(0);
            }
        }
        DFS(0,0,board[0][0]-'0');
        System.out.println(Collections.max(nums) + " " + Collections.min(nums));
    }
}
