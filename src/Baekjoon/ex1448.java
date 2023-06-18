package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 삼각형 만들기 - S3 - 정렬
public class ex1448 {

    static int n;
    static Integer[] arr;

    public static int solution(){
        // 삼각형 만드는 조건
        // 길이가 가장 긴 변의 길이 < 다른 두 변의 합

        Arrays.sort(arr, Collections.reverseOrder());

        // 2 2 2 3 3 4
        // 4 5 6 7
        // 1 2 2
        // 20 7 6 5 4
        int answer=0;

        for(int i=0; i<n-2; i++){
            if(arr[i] < arr[i+1] + arr[i+2]) {
                answer =Math.max(answer,arr[i]+arr[i+1]+arr[i+2]);
            }
        }

        if(answer==0) answer=-1;

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println(solution());
    }
}
