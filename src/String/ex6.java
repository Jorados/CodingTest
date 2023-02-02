package String;

import java.util.Scanner;

//중복문자제거
public class ex6 {
    public static String solution(String s){
        String answer="";
        for(char c : s.toCharArray()){
            if(answer.indexOf(c) < 0) answer+=c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
