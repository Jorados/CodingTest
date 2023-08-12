package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


// 알바생 강호 - 정렬
public class ex1758 {
    static int n;
    static Integer[] arr;
    static long answer=0;
    static int cnt=1;
    public static void solution(){
        //손님의 순서를 적절히 바꿔서 최대값을 받게끔 해야한다.
        Arrays.sort(arr,(o1,o2) -> o2 - o1);
        for(int i=0; i<n; i++){
            long tip = arr[i] - ( cnt - 1 );
            if(tip>0) answer += tip;
            cnt++;
        }
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
