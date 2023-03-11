package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//백준 - 2583 - 영역 구하기 - s1
public class ex2583 {
    static int n,m,k,cnt=0;
    static int[][] board;
    static ArrayList<Integer> arr;
    static int[] dx={0,1,0,-1};
    static int[] dy={-1,0,1,0};


    public static void DFS(int x, int y){
        board[x][y]=1;
        cnt++;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<m && ny>=0 && ny<n && board[nx][ny]==0){
                DFS(nx,ny);
            }
        }
    }

    public static void solution(int[][] board){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==0){
                    cnt=0;
                    DFS(i,j);
                    arr.add(cnt);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m=sc.nextInt();
        n=sc.nextInt();
        k=sc.nextInt();
        board = new int[m][n];

        for(int i=0; i<k; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int a=y1; a<y2; a++){
                for(int b=x1; b<x2; b++){
                    board[a][b] = 1;
                }
            }
        }

        arr = new ArrayList<>();
        solution(board);
        System.out.println(arr.size());
        Collections.sort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
