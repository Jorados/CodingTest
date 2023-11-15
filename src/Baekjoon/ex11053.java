package Baekjoon;


import java.util.Scanner;

// 가장 긴 증가하는 부분 수열
public class ex11053 {
    static int answer=0;
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] dp = new int[n];


    }
}
