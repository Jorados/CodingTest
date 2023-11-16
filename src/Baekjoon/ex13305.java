package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 주유소
public class ex13305 {

    static int n; //도시 수
    static long[] street; //도시 사이의 거리
    static long[] oils; //기름값
    static long total=0;
    public static void solution(){
        for(int i=0; i<oils.length-1; i++){
            if(oils[i+1] > oils[i]) oils[i+1] = oils[i];
            if(i!=oils.length-1) total += street[i] * oils[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        street = new long[n-1];
        oils = new long[n];

        for(int i=0; i<n-1; i++){
            street[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            oils[i] = sc.nextInt();
        }
        solution();
        System.out.println(total);
    }
}
