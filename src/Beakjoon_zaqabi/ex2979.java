package Beakjoon_zaqabi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 트럭 주차 - B2

public class ex2979 {
    static int first = Integer.MAX_VALUE;
    static int last = Integer.MIN_VALUE;
    static int a,b,c;

    public static int solution(int[][] truck , int[] arr){
        int answer=0;
        //가장 이른시간 , 가장 늦은 시간
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                first = Math.min(first,truck[i][j]);
                last = Math.max(last,truck[i][j]);
            }
        }

        //주차 요금 구하기
        for(int i=first; i<last; i++){
            if(arr[i]==1) answer += a*arr[i];
            else if(arr[i]==2) answer += b*arr[i];
            else if(arr[i]==3) answer += c*arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int[][] truck = new int[3][2];
        int[] arr = new int[100]; //시간

        for(int i=0; i<3; i++){
            int st = sc.nextInt();
            int et = sc.nextInt();
            truck[i][0]=st;
            truck[i][1]=et;

            for(int j=st; j<et; j++) arr[j]++;
        }

        System.out.println(solution(truck,arr));
    }
}
