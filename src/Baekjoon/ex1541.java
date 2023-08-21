package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 잃어버린 괄호 - 그리디
public class ex1541 {
    static int answer=0;
    static boolean first = false;
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] ctr = s.toCharArray();
        String str = "";
        for(int i=0; i<ctr.length; i++){
            if(Character.isDigit(ctr[i])) str += ctr[i];

            if(!Character.isDigit(ctr[i]) && ctr[i]=='+'){
                if(flag){
                    answer -= Integer.parseInt(str);
                }
                else {
                    answer += Integer.parseInt(str);
                }
                str="";
            }
            else if(!Character.isDigit(ctr[i]) && ctr[i]=='-'){
                flag = true;
                if(!first) {
                    answer += Integer.parseInt(str);
                    first=true;
                }
                else answer-= Integer.parseInt(str);
                str="";
            }

        }

        if(flag) answer-=Integer.parseInt(str);
        else answer+=Integer.parseInt(str);

        System.out.println(answer);
    }
}
