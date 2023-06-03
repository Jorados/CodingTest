package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex15656 {

    static int n,m;
    static int[] arr;
    static int[] ch;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int L){
        if(L==m){
            for(int x : ch){
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else{
            for(int i=0; i<n; i++){
                ch[L]=arr[i];
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        ch = new int[m];

        Arrays.sort(arr);
        DFS(0);

        System.out.println(sb);

    }
}
