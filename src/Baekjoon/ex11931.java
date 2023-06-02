package Baekjoon;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 수 정렬하기 4 - S5  - 정렬
public class ex11931 {

    static int n;
    static BigInteger[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new BigInteger[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextBigInteger();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(BigInteger x : arr){
            System.out.println(x);
        }
    }
}
