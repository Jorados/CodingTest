package Baekjoon;


import java.util.Scanner;

public class ex15652 {
    static int n;
    static int m;
    static int[] ch; // 담는배열
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int at,int L){
        if(L==m){
            for(int x : ch){
                sb.append(x+" ");
            }
            sb.append('\n');
        }
        else{
            for(int i=at; i<=n; i++){
                ch[L]=i;
                DFS(i,L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        DFS(1,0);
        System.out.println(sb);
    }
}
