package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class ex4 {

    public static int solution(int n,int[] arr,int m){
        int answer=0;
        int sum=0;
        int lt=0; int rt=0;
        while(rt<n){
            if(sum<m){
                sum+=arr[rt++];
            }
            else if(sum>m){
                sum-=arr[lt++];
            }
            else if(sum==m){
                answer++;
                sum+=arr[rt++];
            }
        }
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

        System.out.println(solution(n,arr,m));
    }
}
