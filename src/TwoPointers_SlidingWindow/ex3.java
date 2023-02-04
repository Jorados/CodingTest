package TwoPointers_SlidingWindow;


import java.util.Scanner;

//최대매출
public class ex3 {

    public static int solution(int n, int m, int[] arr){
        int answer=0;
        int sum=0;
        for(int i=0; i<m; i++) sum+=arr[i];
        answer = sum;

        for(int i=m; i<n; i++){
            sum+=arr[i]-arr[i-m];
            answer = Math.max(answer,sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }
}
