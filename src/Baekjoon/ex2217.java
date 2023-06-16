package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 로프 - S4 - 정렬
public class ex2217 {

    static int n;
    static int[] rope;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        rope = new int[n];
        for(int i=0; i<n; i++){
            rope[i] = sc.nextInt();
        }

        Arrays.sort(rope);
        int answer=0;

        for(int i=0; i<n; i++){
            answer = Math.max(answer,rope[i]*(n-i));
        }

        // 10 -> 10 * 2
        // 15 -> 15 * 1
        System.out.println(answer);
    }
}
