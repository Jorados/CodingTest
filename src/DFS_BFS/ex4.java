package DFS_BFS;

import java.util.Scanner;

public class ex4 {
    static int n,m;
    static int[] answer;

    public static void DFS(int L){
        if(L==m) {
            for(int x : answer) System.out.print(x + " ");
        }
        else{
            for(int i=1; i<=n; i++){
                answer[L]=i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new  int[m];
        DFS(0);
    }
}

