package Array;

import java.util.Scanner;

//격자판 최대합
public class ex9 {

    public static int solution(int n, int[][] arr) {
        int answer=0;
        int sum1,sum2;

        //가로,세로 길이 최고합
        for(int i=0; i<n; i++){
            sum1=0; sum2=0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        sum1=0; sum2=0;
        //대각선 길이 최고합
        for(int i=0; i<n; i++){
                sum1+= arr[i][i];
                sum2+= arr[i][n-i-1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        //최고길이 출력
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,arr));
    }
}
