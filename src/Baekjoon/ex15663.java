package Baekjoon;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ex15663 {

    static int n,m;
    static int[] arr;
    static int[] ch;
    static boolean[] visit;
    static LinkedHashSet<String> set = new LinkedHashSet<>();


    public static void DFS(int L){
        if(L==m){
            StringBuilder sb = new StringBuilder();
            for(int x : ch){
                sb.append(x + " ");
            }
            set.add(sb.toString());
        }
        else{
            for(int i=0; i<n; i++){
                if(!visit[i]){
                    visit[i]=true;
                    ch[L]=arr[i];
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
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ch = new int[m];
        visit = new boolean[n];
        Arrays.sort(arr);
        DFS(0);
        for(String s : set){
            System.out.println(s);
        }
    }
}

