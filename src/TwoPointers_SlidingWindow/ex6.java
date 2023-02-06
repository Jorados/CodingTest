package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class ex6 {
    public static int solution(int n,int[] arr,int m){
        int answer=0;
        int rt=0; int lt=0;
        int cnt=0;
        while(rt<n){
            if(cnt<=m) {
                rt++;
                if(arr[rt]==0) {
                    cnt++;
                    continue;
                }
            }
            else if(cnt>m && arr[rt]==0) {
                lt++;
                if(arr[lt]==0) cnt--;
            }
            answer = Math.max(answer,(rt-lt));
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n,arr,m));
    }
}
