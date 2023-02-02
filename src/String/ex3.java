package String;

import java.util.Scanner;

public class ex3 {
    public static String solution(String s){
        String answer="";
        int max=0;
        String[] ss = s.split(" ");
        for(String c : ss){
            if(c.length()>max){
                max=c.length();
                answer=c;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }
}
