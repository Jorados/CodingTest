package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 숫자판 점프 - S2 - DFS
public class ex2210 {

    static String[][] board = new String[5][5];
    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
    static int cnt=0;
    static ArrayList<String> arr = new ArrayList<>();
    public static void DFS(int L,int x,int y,String tmp){
        if(L==5){
            if(!arr.contains(tmp)) arr.add(tmp);
        }
        else{
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && nx<5 && ny>=0 && ny<5){
                    DFS(L+1,nx,ny,tmp+board[nx][ny]);
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                board[i][j] = sc.next();
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                DFS(0,i,j,board[i][j]);
            }
        }
        System.out.println(arr.size());
    }


}
