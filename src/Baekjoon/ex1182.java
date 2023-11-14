package Baekjoon;

import java.util.Scanner;

// 부분수열의 합
// -> 완전탐색으로 찾자.
public class ex1182 {
    static int n;
    static int m;
    static int[] arr;
    static int answer=0;
    public static void DFS(int L,int sum){
        if(L==n){
            if(sum==m) answer++;
            return;
        }

        DFS(L+1,sum+arr[L]);
        DFS(L+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        m = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        DFS(0,0);
        if(m==0) System.out.println(answer-1);
        else System.out.println(answer);
    }
}
