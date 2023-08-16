package Baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 2 + 1 세일 : 정렬
public class ex11508 {
    static int n;
    static int cnt=0;
    static Integer[] arr;
    static int answer=0;
    public static void solution(){
        Arrays.sort(arr,Collections.reverseOrder());
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i%3==2) continue;
            sum += arr[i];
        }
        answer=sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        solution();
        System.out.println(answer);
    }
}
