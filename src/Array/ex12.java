package Array;


import java.util.Scanner;

//멘토링
public class ex12 {
    //멘토,멘티가 되려면 모든 시험의 경우에서
    //멘토 > 멘티 : 성적
    public static int solution(int n,int m,int[][] arr) {
        int answer=0;
        //학생 4x4
        //입력이 1~4라서 1부터시작
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                //테스트
                for(int k=0; k<m; k++){
                    int pi=0; int pj=0;
                    //등수체크
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
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
