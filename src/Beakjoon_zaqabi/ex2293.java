package Beakjoon_zaqabi;


import java.util.Scanner;

// 동전 1 - G5 -> 다이나믹으로 풀어야함..
public class ex2293 {

    static int n,m,answer=0;
    static int[] arr;

    public static void solution(int L,int sum) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        solution(1,0);
        System.out.println(answer);
    }
}
