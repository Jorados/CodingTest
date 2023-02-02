package String;

import java.util.Scanner;

//문자열 압축
public class ex11 {
    public static String  solution(String s){
        String answer="";
        //같은문자면 cnt++
        int cnt=1;
        for(char c : s.toCharArray()){
            if(answer.indexOf(c) < 0){
                if(cnt > 1) answer+=String.valueOf(cnt);
                answer+=c;
                cnt=1;
            }else{
                cnt++;
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
