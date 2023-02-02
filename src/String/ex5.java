package String;

import java.util.Scanner;

//특정 문자 뒤집기
public class ex5 {
    public static char[] solution(String s){
        String answer = "";
        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c)){
                answer+=c;
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String rs = sb.reverse().toString();
        int cnt=0;
        char[] cs = s.toCharArray();
        for(int i=0; i<cs.length; i++){
            if(Character.isAlphabetic(cs[i])){
                cs[i]=rs.charAt(cnt);
                cnt++;
            }
        }
        return cs;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char c : solution(s)){
            System.out.print(c);
        }
    }
}
