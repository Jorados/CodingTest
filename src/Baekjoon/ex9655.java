package Baekjoon;


import java.util.Scanner;

// 돌 게임 - S5
public class ex9655 {
    static int n;
    static String answer="";

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        if(n%2==1) answer="SK";
        else answer="CY";

        System.out.println(answer);
    }
}
