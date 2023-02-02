package Array;

import java.util.Scanner;

//5
//10 13 10 12 15
//12 39 30 23 11
//11 25 50 53 15
//19 27 29 37 27
//19 13 30 13 19
// --> 155
public class Array9 {

    public static int solution(int n,int[][] arr){
        int answer = 0;
        int sum1,sum2;

        for(int i=0; i<arr.length; i++){
            sum1=sum2=0;
            for(int j=0; j<arr.length; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer,sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<arr.length; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,arr));
    }
}
