package Baekjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 행복 유치원 - G5 - 정렬
public class ex13164 {

    static int n,k;
    static int[] student;
    static int answer=0;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void solution(){
        Arrays.sort(student);

        // 1 3 5 6 10
        // 차이 : 2 2 1 4 -> 1 2 2 4

        for(int i=1; i<n; i++){
            list.add(student[i]-student[i-1]);
        }

        Collections.sort(list);

        for(int i=0; i<n-k; i++){
            answer+=list.get(i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        student = new int[n];
        for(int i=0; i<n; i++){
            student[i] = sc.nextInt();
        }

        solution();
        System.out.println(answer);
    }
}
