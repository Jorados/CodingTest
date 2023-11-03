package CodingTest.Back;

import java.util.Scanner;

public class ex15649 {

    static int n;
    static int m;
    static int[] ch;
    static boolean[] visit;
    public static void DFS(int L){
        if(L==m){
            for(int x : ch){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        else{
            for(int i=1; i<=n; i++){
                if(!visit[i]){
                    visit[i]=true;
                    ch[L]=i;
                    DFS(L+1);
                    visit[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        visit = new boolean[n+1];
        DFS(0);
    }
}
