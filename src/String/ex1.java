package String;

import java.util.Scanner;

public class ex1 {
    public static int solution(String s, char c){
        int answer=0;
        String ss = s.toLowerCase();
        for (int i = 0; i < ss.length(); i++) {
            if(ss.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(s,c));
    }
}
