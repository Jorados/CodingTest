package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 세 수 - B3 - 정렬
public class ex10817 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Integer> arr =  new ArrayList<>();

        arr.add(a);
        arr.add(b);
        arr.add(c);

        Collections.sort(arr);
        System.out.println(arr.get(1));
    }
}
