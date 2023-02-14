package DFS_BFS;

import java.util.Scanner;
//수열 추측하기
//수열 추측하기는 규칙을 가진다
// 3 1 2 4
//  4 3 6
//   7 9
//    16
//여기서 4자리 숫자로 16을 만드는 조합경우의수 의 숫자는 3 1 2 4 인데
//3C0 3C1 3C2 3C3 을 각각 해당자리수랑 곱해서 더했을 때 16이 된다.
//이 문제에서는 해당 조합경우의수와 곱했을 때 16이 되는 수를 구해야한다.
public class ex8 {

    static int[] ch,b,p;
    static int[][] dy = new int[35][35];
    static int n,f;

    public static int combi(int n,int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n==r||r==0) return 1;
        else{
            return dy[n][r] = combi(n-1,r-1) + combi(n-1,r);
        }
    }

    static boolean flag = false;
    public static void DFS(int L, int sum){
        if(flag) return;
        if(L==n){
            if(sum==f){
                for(int x : p) System.out.print(x + " ");
                flag = true;
            }
        }
        else{
            for(int i=1; i<=n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    p[L]=i;
                    DFS(L+1,sum+(p[L]*b[L]));
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();
        f= sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];

        for(int i=0; i<n; i++){
            b[i] = combi(n-1,i);
        }
        DFS(0,0);
    }
}
