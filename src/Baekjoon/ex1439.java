package Baekjoon;


import java.util.Scanner;

// 백준 - 뒤집기 - S5
public class ex1439 {
    static boolean flag;
    public static int solution(String s){
        int answer=0;
        if(s.charAt(0)==0) flag = true;
        else if(s.charAt(0)==1) flag = false;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)=='1' && flag==true){
                answer++;
                flag = false;
            }
            else if(s.charAt(i)=='0' && flag==false){
                answer++;
                flag = true;
            }
        }
        return answer/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        System.out.println(solution(n));
    }
}
