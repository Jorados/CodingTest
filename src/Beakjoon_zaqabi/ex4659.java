package Beakjoon_zaqabi;

import java.util.Scanner;

// 비밀번호 발음하기 - S5
public class ex4659 {

    // 비밀번호 생성규칙
    // 1.모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
    // 2.모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
    // 3.같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
    public static String solution(String s){
        String answer = "";
        int cnt=0;
        int cnt2=0;
        String[] mo = {"a","e","i","o","u"};
        String[] za = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};

        if(s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")){

        }
        else{
            System.out.println("<" + s + ">" + " is not acceptable.");
        }



        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solution(s));
    }
}
