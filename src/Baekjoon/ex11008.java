package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 복붙의 달인 - S5
public class ex11008 {

    public static void solution(int n, String[] s){
        int count=0;

        for(String str : s){
            String[] answer = str.split(" ");

            String list = answer[0].replaceAll(answer[answer.length - 1], "1");

            count = list.length();
            System.out.println(count);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];

        for(int i=0; i<n; i++){
            s[i] = sc.nextLine();
        }

        solution(n,s);
    }

}
