package String;

import java.util.Scanner;

//숫자만 추출
public class ex9 {
    public static int  solution(String s){
        int answer=0;
        String match = "[^0-9]";
        String ss = s.replaceAll(match, "");
        answer = Integer.parseInt(ss);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }
}
