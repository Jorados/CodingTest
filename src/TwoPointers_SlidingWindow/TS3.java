package TwoPointers_SlidingWindow;

import java.util.Scanner;
//최대 매출 [ 슬라이딩 윈도우 ]
//10 3
//12 15 11 20 25 10 20 19 13 15
// --> 56
public class TS3 {
    public static int solution(int n, int k, int[] arr){
        int answer =0;
        int sum=0;

        for(int i=0; i<k; i++){
            sum+=arr[i];
        }

        answer = sum;

        for(int i=k; i<arr.length; i++){
            sum+=(arr[i] - arr[i-k]);
            answer = Math.max(answer,sum);
        }
        return answer;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
