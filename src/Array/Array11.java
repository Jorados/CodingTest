package Array;

import java.util.Scanner;

//임시 반장 정하기
//5
//2 3 1 7 3
//4 1 9 6 8
//5 5 2 4 4
//6 5 2 6 7
//8 4 2 2 2
// --> 4
public class Array11 {
    public static int solution(int n, int[][] arr){
        int answer = 0;
        int max =0;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<6; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer=i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,arr));
    }

}
