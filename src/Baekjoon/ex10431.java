package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 줄 세우기
public class ex10431 {
    static int n;
    static int[] arr;
    static int answer=0;
    public static void solution(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[i]) answer++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        while (n-->0){
            arr = new int[20];

            int num = sc.nextInt();

            for(int i=0; i<20; i++){
                arr[i] = sc.nextInt();
            }

            solution();
            System.out.println(num + " " + answer);
            answer=0;
        }
    }
}
