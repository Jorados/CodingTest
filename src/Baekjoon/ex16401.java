package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 과자 나눠주기
public class ex16401 {
    static int m; // 조카
    static int n; // 과자 수
    static int[] snack;
    static long answer=0;
    public static void solution(){
        // 이분 탐색 필수 조건 -> 정렬
        Arrays.sort(snack);

        long lt = snack[0];
        long rt = snack[snack.length-1];
        while (lt<=rt){
            long mid = (lt + rt) / 2;
            int cnt =0;

            for(int x : snack) cnt += x/mid;

            if(cnt>=m){
                if(answer<mid) answer=mid;
                lt = mid+1;
            }
            else if(cnt<m){
                rt = mid-1;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        snack = new int[n];
        for(int i=0; i<n; i++) {
            snack[i] = sc.nextInt();
        }

        solution();
        System.out.println(answer);
    }
}
