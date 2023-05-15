package Baekjoon;


import java.util.Scanner;

// RGB 거리 - S1 - DP
// 결과적으로 각 집의 최솟값을 찾아 누적합을 구하는 것이 아닌
// 모든 경로의 경우의 수를 찾아서 최종적으로 작은 누적합을 찾아야 한다.
public class ex1149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt(); // R
            arr[i][1] = sc.nextInt(); // G
            arr[i][2] = sc.nextInt(); // B
        }

        for(int i=1; i<n; i++){
            arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
            arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
            arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
        }

        System.out.println(Math.min(Math.min(arr[n-1][0],arr[n-1][1]) ,arr[n-1][2]));


    }
}
