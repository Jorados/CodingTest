package String;

import java.util.Scanner;

public class ex12_2 {
    public static String solution(int n,String s){
        String answer="";

        for(int i=0; i<n; i++) {
            String ss = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(ss, 2);
            answer += (char)num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        System.out.println(solution(n,s));
    }

}
