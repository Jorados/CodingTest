package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 수 고르기 - S3 - 정렬
public class ex20186 {
    static int n,k;
    static Integer[] arr;
    static int answer=0;
    public static void solution(){
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<k; i++){
            answer+=arr[i]-i;
        }

    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        solution();
        System.out.println(answer);
    }
}
