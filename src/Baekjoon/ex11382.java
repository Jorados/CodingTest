package Baekjoon;

import java.util.Scanner;

public class ex11382 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();

        long answer = n + m + k;
        System.out.println(answer);
    }
}
