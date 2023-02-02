package String;


import java.util.Scanner;

//팰린드롬
public class ex8 {
    public static String  solution(String s){
        String answer="NO";
        String us = s.toUpperCase();
        String match = "[^A-Z]";
        String ss = us.replaceAll(match, "");
        StringBuilder sc = new StringBuilder(ss);
        String rs = sc.reverse().toString();

        if(ss.equals(rs)){
            return answer="YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }
}
