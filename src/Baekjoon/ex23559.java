package Baekjoon;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 밥 - G5 - 정렬
public class ex23559 {
    static int n,x;
    static int[][] arr;
    static int sum=0;

    public static void solution(){
        // 두개의 차를 ArrayList에 담아서 내림차순 정렬을 한다.

        // 차가 큰 순서대로 내림차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int oper1 = o1[1] - o1[0];
                int oper2 = o2[1] - o2[0];

                return oper1 - oper2;
            }
        });

        // 5천원 짜리 먹기 가능 횟수
        // ( 이미 천원짜리 종합에서 뺄거라서 ( x - 1000 * n )
        // ( 1000원짜리 취소 해야하니까 4000 )
        int countDown = (x - 1000 * n) / 4000;

        for(int i = 0; arr[i][0] > arr[i][1] && countDown > 0; i++) {
            sum -= arr[i][1]; // 천원짜리 맛 빼고
            sum += arr[i][0]; // 오천원짜리 맛 추가

            countDown--; // 횟수 차감
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = sc.nextInt();

        arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            sum += arr[i][1];
        }

        solution();
        System.out.println(sum);
    }
}
