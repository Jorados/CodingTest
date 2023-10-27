package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// A와 B
public class ex12904 {

    static String a = "";
    static String b = "";
    static int answer=0;
    public static void solution(){

        StringBuilder s = new StringBuilder(a);
        StringBuilder t = new StringBuilder(b);

        while (s.length() < t.length()) {
            if (t.charAt(t.length() - 1) == 'A') {
                t.deleteCharAt(t.length() - 1);
            }else if (t.charAt(t.length() - 1) == 'B') {
                t.deleteCharAt(t.length() - 1);
                t.reverse();
            }
        }

        if(s.toString().equals(t.toString())){
            answer=1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.next();
        sc.nextLine();
        b = sc.next();

        solution();
        System.out.println(answer);
    }
}
