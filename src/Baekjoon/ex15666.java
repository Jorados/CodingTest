package Baekjoon;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ex15666 {

    static int n,m;
    static int[] arr;
    static int[] ch;
    static boolean[] visit;
    static LinkedHashSet<String> set = new LinkedHashSet<>();
    public static void DFS(int s,int L){
        if(L==m){
            StringBuilder sb = new StringBuilder();
            for(int x : ch){
                sb.append(x + " ");
            }
            set.add(sb.toString());
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
        visit = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        DFS(0,0);

        for(String x : set){
            System.out.println(x);
        }

    }
}
