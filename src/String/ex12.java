package String;

import java.util.Scanner;

public class ex12 {
    public static String solution(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String ss = s.substring(0, 7).replace('#','1').replace('*','0');
            int twoS = Integer.parseInt(ss, 2);
            //10진수에 해당하는 아스키문자 구해서
            //answer+=에 담고
            //다시 substring하면됨.
            answer+=(char)twoS;
            s = s.substring(7);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(solution(n,s));
    }
}
