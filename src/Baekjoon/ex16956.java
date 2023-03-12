package Baekjoon;


import java.util.Scanner;

//늑대와 양 - s3
public class ex16956 {
    static int n,m;
    static char[][] arr;
    static int[] dx={0,1,0,-1};
    static int[] dy={-1,0,1,0};
    static boolean flag = true;
    public static void DFS(int x, int y){
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<m){
                if(arr[nx][ny]=='.'){
                    arr[nx][ny]='D';
                }
                if(arr[nx][ny]=='S'){
                    flag=false;
                    return;
                }
            }
        }
    }
    public static void solution(char[][] arr){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]=='W'){
                    DFS(i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();
        arr = new char[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++){
                arr[i][j] = str.charAt(j);
            }
        }
        solution(arr);

        if(flag==true){
            System.out.println(1);
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        else System.out.println("0");
    }
}
