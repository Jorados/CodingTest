package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// UCPC는 무엇의 약자일까? - S5
public class ex15904 {

    public static String solution(String s){
        char[] ucpc = {'U','C','P','C'};
        int index=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==ucpc[index]){
                index++;
            }
            if(index==4){
                return "I love UCPC";
            }
        }
        return "I hate UCPC";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(solution(s));
    }
}
