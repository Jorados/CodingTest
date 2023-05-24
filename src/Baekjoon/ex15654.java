package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// N과 M - S3
public class ex15654 {

    static int n;
    static int m;
    static int[] arr;
    static int[] ch; // 담는배열
    static boolean[] flag;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int L){
        if(L==m){
            for(int i=0; i<ch.length; i++){
                sb.append(ch[i] + " ");
            }
            sb.append('\n');
        }
        else{
            for(int i=0; i<arr.length; i++){
                // 가지고 있으면 출력안됨
                if(!flag[i]) {
                    flag[i]=true;
                    ch[L] = arr[i];
                    DFS(L+1);
                    flag[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        arr = new int[n];
        flag = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순 정렬

        DFS(0);
        System.out.println(sb);
    }
}
