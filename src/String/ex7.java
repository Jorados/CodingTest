package String;

import java.util.Scanner;

//회문 문자열
public class ex7 {
    public static String solution(String s){
        String answer="NO";
        String Us = s.toUpperCase();
        StringBuffer sb = new StringBuffer(Us);
        String rs = sb.reverse().toString();

        if(Us.equals(rs)){
            return answer="YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
