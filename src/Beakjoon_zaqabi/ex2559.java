package Beakjoon_zaqabi;


import java.util.Scanner;

// 수열 (온도 구하기) - S3
// 슬라이딩 윈도우
public class ex2559 {

    static int n,m;
    static int[] arr;
    public static int solution(){
        int answer=0;
        int sum=0;
        for(int i=0; i<m; i++) sum+=arr[i];
        answer=sum;

        for(int i=m; i<arr.length; i++){
            sum+=arr[i]-arr[i-m];
            answer=Math.max(answer,sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution());
    }
}
