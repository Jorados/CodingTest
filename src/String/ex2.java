package String;

import java.util.Scanner;

public class ex2 {
    public static String solution(String s){
        String answer="";

        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                answer+=Character.toUpperCase(c);
            }
            if(Character.isUpperCase(c)){
                answer+=Character.toLowerCase(c);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
