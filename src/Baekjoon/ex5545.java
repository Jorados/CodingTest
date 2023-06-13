package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 최고의 피자 - S3 - 정렬
public class ex5545 {

    static int n; // 토핑 종류 수
    static int A,B; // 도우,토핑 가격
    static int dowKcal; // 도우 칼로리
    static Integer[] top; // 토핑 열랑
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        dowKcal = sc.nextInt();

        top = new Integer[n];
        for(int i=0; i<n; i++){
            top[i] = sc.nextInt();
        }

        Arrays.sort(top, Collections.reverseOrder());

        // 계속 토핑을 추가해보면서 이전것보다 작으면 break 하고, 이전까지의 토핑했던걸
        // 1원당 칼로리를 출력하면된다.

        // 기본 토핑 0개의 1원당 열량
        int answer = dowKcal / A;

        int nowPrice = A;
        int nowKcal = dowKcal;
        for(int i=0; i<n; i++){
            nowPrice += B;
            nowKcal += top[i];

            // 현재 만들고있는 피자의 1원당 열량
            int nowPizza = nowKcal / nowPrice;

            if(answer > nowPizza){
                break;
            }else answer = nowPizza;
        }

        System.out.println(answer);
    }
}
