package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 빽트래킹 - n과 m
public class ex15657 {
    static int n;
    static int m;
    static int[] arr;
    static int[] ch;

    public static void DFS(int s,int L){
        if(L==m){
            for(int x : ch){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i=s; i<n; i++){
                ch[L]=arr[i];
                DFS(i,L+1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        ch = new int[m];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        DFS(0,0);

    }
}
