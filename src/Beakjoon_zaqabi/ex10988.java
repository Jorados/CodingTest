package Beakjoon_zaqabi;


import java.util.Scanner;

// 팰린드롬인지 확인하기 - B2
public class ex10988 {
    public static void solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();

        if(s.equals(reverse)) System.out.println(1);
        else System.out.println(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        solution(s);
    }
}
