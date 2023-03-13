package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 안전 영역 - 2468 - s1
public class ex2468 {
    static int[] dx={0,1,0,-1};
    static int[] dy={-1,0,1,0};
    static int n,cnt=0;
    static int[][] arr;
    static int max=Integer.MIN_VALUE;
    static int[][] ch;
    static ArrayList<Integer> list;
    public static void DFS(int x,int y,int h){
        ch[x][y]=1;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n){
                if(arr[nx][ny]>h && ch[nx][ny]==0){
                    DFS(nx,ny,h);
                }
            }
        }
    }
    //i 보다 낮은 곳은 다 0으로 만들고나서 -> DFS 를 호출해서 영역체크
    public static void solution(int[][] arr,int[][] ch, int h){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]>h && ch[i][j]==0){
                    DFS(i,j,h);
                    cnt++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        n=sc.nextInt();
        arr = new int[n][n];
        ch = new int[n][n];
        list = new ArrayList<>();
        list.add(1);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
                max = Math.max(max,arr[i][j]);
            }
        }

        //각 i 높이의 영역의 수를 구해야함.
        for(int i=1; i<max; i++){
            cnt=0;
            solution(arr,ch,i); //arr탐색
            list.add(cnt);
            ch = new int[n][n]; //체크배열 초기화
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
