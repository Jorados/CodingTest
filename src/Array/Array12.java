package Array;

import java.util.Scanner;

//멘토, 멘티 구하기
//4 3
//3 4 1 2
//4 3 2 1
//3 1 4 2
// -> 3
public class Array12 {

    public static int solution(int n, int m, int[][] arr){
        int answer = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0,pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s] == i) pi++;
                        if(arr[k][s] == j) pj++;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,m,arr));
    }
}
