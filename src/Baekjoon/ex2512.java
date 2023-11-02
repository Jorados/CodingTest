package Baekjoon;


import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

// 예산
public class ex2512 {

    static int n;
    static int[] arr;
    static int total;

    public static long solution(int sum){
        int answer=0;
        // 110 120 140 150
        Arrays.sort(arr);


        // 총 예산 = total

        long lt = 0;
        long rt = arr[n-1];
        while (lt<=rt){
            long mid = (lt + rt) / 2;
            long budget = 0;

            for(int i=0; i<n; i++){
                if(mid >= arr[i]){
                    budget += arr[i];
                }
                else if(mid < arr[i]){
                    budget += mid;
                }
            }

            if(budget <= total) lt = mid + 1;
            else rt = mid - 1;
        }

        return rt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        int sum=0;
        int max =Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
            max = Math.max(max,arr[i]);
        }
        total = sc.nextInt();

        if(sum <= total) System.out.println(max);
        else System.out.println(solution(sum));
    }
}
