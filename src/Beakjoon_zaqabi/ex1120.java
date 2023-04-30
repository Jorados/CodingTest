package Beakjoon_zaqabi;


import java.util.Scanner;

// 문자열 - S4
public class ex1120 {

    public static int solution(String a,String b){
       int answer=Integer.MAX_VALUE;

       for(int i=0; i<=b.length()-a.length(); i++){
           int cnt=0;
           for(int j=0; j<a.length(); j++){
               if(a.charAt(j) != b.charAt(i+j)) cnt++;
           }
           answer=Math.min(answer,cnt);
       }

       return answer;
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(solution(a,b));
    }
}
