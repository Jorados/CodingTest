package Beakjoon_zaqabi;


import java.util.HashMap;
import java.util.Scanner;

// 팰린드롬 - S3
public class ex1213 {
    public static void solution(String s){
        String answer="";
        //1. 각 알파벳 갯수를 구한다
        //2. 갯수가 홀수인 알파벳은 0이거나 1이어야 한다
        //3. 1일 경우 문자열 길이는 홀수여야 되고 해당 알파벳은 무조건 가운데에 있어야 한다
        //4. 먼저 알파벳 순서대로 출력, 가운데 문자 출력, 뒤집은 알파벳을 출력하면 된다

        int[] alp = new int[26];
        for(int i=0; i<s.length(); i++){
            alp[s.charAt(i)-'A']++;
        }
        int cnt=0;
        int center=0;
        for(int i=0; i<26; i++){
            if(alp[i]%2!=0){
                center=i; //해당 i번째 문자
                cnt++; //홀수인 문자의 개수
            }
        }

        if(cnt>1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        for(int i=0; i<26; i++){
            for(int j=0; j<alp[i]/2; j++){ //절반까지만 다 더하고
                answer+=(char)(i+'A');
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        if(cnt==1) answer+=(char)(center+'A'); //하나의 홀수인 문자 가운데 다 넣고
        answer+=reverse;

        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        solution(s);
    }
}
