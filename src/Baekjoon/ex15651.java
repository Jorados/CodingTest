package Baekjoon;

import java.util.Scanner;

public class ex15651 {
    static int n;
    static int m;
    static int[] ch;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int L){
        if(L==m){
            for(int x : ch){
                sb.append(x+" ");
            }
            sb.append('\n');
        }
        else{
            for(int i=1; i<=n; i++){
                    ch[L]=i;
                    DFS(L+1);
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        DFS(0);
        System.out.println(sb);
    }
}
