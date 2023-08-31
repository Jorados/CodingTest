package Baekjoon;


import java.util.Scanner;

// 주식 - 그리디
public class ex11501 {
    static int t;
    static long answer=0;
    public static void solution(int n,int[] arr){
        // 계속 올라가다가 내려가면 그떄, 처음부터 최고점 까지 다 더해준다.
        int max = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] <= max) answer += max - arr[i];
            else{
                max = arr[i];
                continue;
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int cnt=0;
        while(cnt < t){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            answer=0;
            solution(n,arr);
            cnt++;
            System.out.println(answer);
        }
    }
}
