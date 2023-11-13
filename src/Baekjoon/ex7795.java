package Baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex7795 {
    static int T;
    static int a,b;
    static Integer[] arr;
    static int[] brr;
    static int answer=0;
    public static void solution(){
        Arrays.sort(arr, Collections.reverseOrder()); //오름차순
        Arrays.sort(brr); // 내림차순

        for(int a : arr){
            for(int b : brr){
                if(a>b) answer++;
                else break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        T = sc.nextInt();

        while (T-- >0){
            a = sc.nextInt();
            b = sc.nextInt();
            arr = new Integer[a];
            for(int i=0; i<a; i++){
                arr[i] = sc.nextInt();
            }
            brr = new int[b];
            for(int i=0; i<b; i++){
                brr[i] = sc.nextInt();
            }

            solution();
            System.out.println(answer);
            answer=0;
        }
    }
}
