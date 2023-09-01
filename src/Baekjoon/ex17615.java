package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 볼 모으기 - 그리디
public class ex17615 {
    static int n;
    static String str="";
    static int rCnt=0, bCnt=0;
    static int answer=Integer.MAX_VALUE;
    public static void solution(){
        // B , R 을 양 쪽으로 밀기

        // R
        int cnt=0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='R') cnt++;
            else break;
        }
        answer = Math.min(answer,rCnt-cnt);

        cnt=0;
        for(int i=n-1; i>=0; i--){
            if(str.charAt(i)=='R') cnt++;
            else break;
        }
        answer = Math.min(answer,rCnt-cnt);

        // B
        cnt=0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='B') cnt++;
            else break;
        }
        answer = Math.min(answer,bCnt-cnt);

        cnt=0;
        for(int i=n-1; i>=0; i--){
            if(str.charAt(i)=='B') cnt++;
            else break;
        }
        answer = Math.min(answer,bCnt-cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='R'){
                rCnt++;
            }
            else{
                bCnt++;
            }
        }
        System.out.println(rCnt  + " " + bCnt);
        solution();
        System.out.println(answer);
    }

}
