package Baekjoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//백준 2583 - 단지 번호 붙이기 S1
public class ex6 {

    static int n,cnt=1;
    static ArrayList<Integer> arr = new ArrayList<>();
    static int[][] board;
    static int[][] ch;
    static int[] dx={0,1,0,-1};
    static int[] dy={-1,0,1,0};

    public static void DFS(int x,int y,int[][] board){
        ch[x][y]=1;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1 && ch[nx][ny]!=1){
                cnt++;
                DFS(nx,ny,board);
            }
        }
    }
    public static void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1 && ch[i][j]==0){
                    DFS(i,j,board);
                    arr.add(cnt);
                    cnt=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        board = new int[n][n];
        ch = new int[n][n];

        for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                board[i][j]=input.charAt(j)-'0';
                //board[i][j]=Character.getNumericValue(input.charAt(j));
            }
        }
        solution(board);
        DFS(0,0,board);

        Collections.sort(arr);
        System.out.println(arr.size());
        for(int x : arr){
            System.out.println(x);
        }
    }
}
