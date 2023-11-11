package Baekjoon;


import java.util.Scanner;

// 블로그 2
public class ex20365 {
    static int n;
    static String str="";
    static int answer=1;
    static int Bcnt=0,Rcnt=0;
    public static void solution(){
        char ctr='d';
        for(int i=0; i<str.length(); i++){
            if(ctr != str.charAt(i)){
                if(str.charAt(i)=='R') Rcnt++;
                else if(str.charAt(i)=='B') Bcnt++;
            }
            ctr = str.charAt(i);
        }

        answer += Math.min(Rcnt,Bcnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        str = sc.next();
        solution();
        System.out.println(answer);
    }
}
