package Baekjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 수 정렬하기 - S5
public class ex2751 {

    static int n;
    static ArrayList<Integer> arr;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(Integer x : arr){
            sb.append(x).append('\n');
        }
        System.out.println(sb);
    }
}
