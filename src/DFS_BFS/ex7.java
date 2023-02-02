package DFS_BFS;

import java.util.Scanner;

//조합 경우의 수
public class ex7 {
    static int n=0,r=0;
    static int[][] ch = new int[35][35];

    public static int DFS(int n,int r){
        if(ch[n][r] > 0) return ch[n][r];
        if( n==r || r==0 ) return 1;
        else{
            return ch[n][r] = DFS(n-1,r-1) + DFS(n-1,r);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        System.out.println(DFS(n,r));
    }
}
