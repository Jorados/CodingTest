package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 빽트래킹 - n 과 m
public class ex15655 {

    static int n,m;
    static int[] arr;
    static int[] ch;
    static boolean[] visit;

    public static void DFS(int s,int L) {
        if(L==m){
            for(int x : ch){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i=s; i<n; i++){
                if(!visit[i]){
                    visit[i]=true;
                    ch[L]=arr[i];
                    DFS(i,L+1);
                    visit[i]=false;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[m];
        visit = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        DFS(0,0);
    }
}
