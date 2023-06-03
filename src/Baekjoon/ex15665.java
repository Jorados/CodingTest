package Baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ex15665 {

    static int n,m;
    static int[] arr;
    static int[] ch;
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
                ch[L]=arr[i];
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr =  new int[n];
        ch =  new int[m];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        DFS(0);
        for(String s : set){
            System.out.println(s);
        }
    }
}
