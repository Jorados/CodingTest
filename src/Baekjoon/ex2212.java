package Baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 센서 - G5 - 정렬


//        거리 차이 역순 : 3 2 2 1 0
//        1 3   66 7 9
//        2       3 ( 0 1 2 )
//
//        센서 6개
//        집중국 2개
//        총 5
//
//
//        거리 차이 역순 : 3 3 2 2 2 2 1 1 1
//        3   6 7 8  10  12  14 15  18 20
//        0   2      2      1      2
//
//        센서 10개
//        집중국 5개
//        i=4~8
//        총 7

// 모든 센서 사이의 거리를 구하여 거리배열에 저장 후 역순 정렬한다.
// 제일 거리가 높은 부분을 뛰어 넘고 나머지 부분을 집중국으로 커버친다. -> 이게 최소거리의 합

public class ex2212 {

    static int n; // 센서 개수
    static int k; // 집중국 개수

    public static int solution(int[] arr){
        // 센서 위치사이의 거리기 떄문에 센서 수 보다 사이즈가 1개 작음
        Integer[] dif = new Integer[n-1];
        for(int i=0; i<n-1; i++){
            dif[i] = arr[i+1] - arr[i];
        }

        Arrays.sort(dif, Collections.reverseOrder());

        int answer=0;
        for(int i=k-1; i<n-1; i++){
            answer += dif[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(solution(arr));

    }
}
