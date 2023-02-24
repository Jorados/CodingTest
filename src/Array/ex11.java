package Array;


import java.util.Scanner;

//임시반장 정하기
public class ex11 {
    //한번이라도 같은반이었던 사람이 가장 많은 사람->반장

    public static int solution(int n,int[][] arr){
        int answer =0;
        int max=0;
        //5명끼리 서로 돌리고
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<n; j++){
                //5학급을 비교
                for(int k=0; k<5; k++){
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer+1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n,arr));
    }
}
