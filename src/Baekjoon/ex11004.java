package Baekjoon;


import java.util.Scanner;

// k 번째 수
public class ex11004 {

    static int n;
    static int k;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[k]);
    }
}
