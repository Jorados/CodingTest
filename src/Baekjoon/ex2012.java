package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 등수 매기기 - 정렬 - S3
public class ex2012 {

    static int n;
    static int[] arr;
    static long answer=0;
    public static void solution(){
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            answer += Math.abs(arr[i] - (i+1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution();
        System.out.println(answer);
    }
}
