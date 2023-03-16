package Baekjoon;


import java.util.Scanner;

//백준 N과 M (백 트래킹) - S3
public class ex15649 {
    static int n;
    static int m;
    static int[] ch;
    static int[] visit;

    public static void DFS(int L){
        if(L==m){
            for(int x : ch){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i=1; i<=n; i++){
                if(visit[i]==0){
                    visit[i]=1;
                    ch[L]=i;
                    DFS(L+1);
                    visit[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        visit = new int[20];
        DFS(0);
    }
}
