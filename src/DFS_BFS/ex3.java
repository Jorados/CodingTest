package DFS_BFS;

import java.util.Scanner;

public class ex3 {

    static int n,m,answer=0;

    //time 넘지 않으면서 최대점수를 구해야한다.
    public static void DFS(int L,int sum,int time,int[][] arr){
        if(time>m) return;
        if(L==n) answer = Math.max(answer,sum);
        else{
            DFS(L+1,sum+arr[L][0],time+arr[L][1],arr);
            DFS(L+1,sum,time,arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        DFS(0,0,0,arr);
        System.out.println(answer);
    }
}
