package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// ATM - DP - S4
public class ex11399 {


    static int n;
    static int[] arr;
    static int[] dp;

    public static int solution(){
        int sum=0;

        // 보이는 규칙은 저장
        // 점화식 찾아서 for문 돌려서 dp[]에 저장

        Arrays.sort(arr);
        // 1 2 3 3 4
        // 1 -> 1
        // 1 + 2 -> 3
        // 1 + 2 + 3 -> 6
        // 1 + 2 + 3 + 3 -> 9
        // 1 + 2 + 3 + 3 + 4 -> 13     총 : 32

        int cnt=0;
        for(int i=0; i<n; i++){
            sum += cnt + arr[i];
            cnt += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        n = sc.nextInt();

        arr = new int[n];
        dp = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution());
    }


}
