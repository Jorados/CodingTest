package Array;

import java.util.Scanner;

public class ex10 {

    public static int solution(int n ,int[][] arr){
        int answer=0;
        for(int i=1; i<arr.length-1; i++){
            for(int j=1; j<arr.length-1; j++){
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j+1] && arr[i][j] > arr[i][j-1]){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i=1; i<arr.length-1; i++){
            for(int j=1; j<arr.length-1; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(solution(n,arr));
    }
}
