package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 시간 관리 - S1
public class ex1263 {

    // T = 걸리는 시간
    // S = S시 내에 이 일을 처리해야함
    static int n;
    static int[][] time;
    static int answer=0;
    public static void solution(){
        Arrays.sort(time, (o1,o2)-> o2[1] - o1[1]);

        //늦잠자는시간
        answer = time[0][1] - time[0][0];

        for(int i=1; i<time.length; i++){
            if(time[i][1] < answer){
                answer = time[i][1];
            }
            answer-=time[i][0];
        }

        if(answer>0) System.out.println(answer);
        else System.out.println(-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        time = new int[n][2];

        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                time[i][j] = sc.nextInt();
            }
        }

        solution();
    }
}
