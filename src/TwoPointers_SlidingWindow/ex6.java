package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class ex6 {
    public static int solution(int[] arr,int m){
        int answer=0;
        //1.lt가 0을 만나면 cnt++;
        //2.if(cnt==2 && rt가 0을 만나면 -> cnt-- , lt이동 , rt이동 , cnt++
        //3.이 방식으로 max를 이용해서 길이 최댓값 구하기.

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr,m));
    }
}
