package Baekjoon;


import java.util.Scanner;

// 백준 - 1213 - 팰린드롬 만들기 - S3
public class ex1213 {
//처음 받은 문자열에 대해 알파벳 나온 횟수를 배열에 담는다.
//만약 받은 문자열의 길이가 홀수이면서, 알파벳 출현 횟수가 홀수개 나온 알파벳이 1 이상이면 팰린드롬을 만들 수 없다.
//만약 받은 문자열의 길이가 짝수이면서, 알파벳 출현 횟수가 홀수개 나온 알파벳이 0이상이면 팰린드롬을 만들 수 없다.
//즉, 팰린드롬은 문자열의 길이가 짝수이면서 알파벳들이 다 짝수개 존재하거나, 문자열의 길이가 홀수이면서 다른 알파벳들은 다 짝수개 존재하고, 홀수개  존재하는 알파벳은 1개 이어야 한다.
//위 조건이 아닌 경우, 즉 팰린드롬을 만들 수 있을 때 알파벳을 담은 str 배열을 돌면서, 해당 알파벳 갯수의 반절씩만 담고, 만약 홀수개 존재하는 알파벳이 하나 있을 때 해당 알파벳을 포함하여 ans라는 문자열을 만든다.

    public static String solution(String s){
        String answer ="";

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
