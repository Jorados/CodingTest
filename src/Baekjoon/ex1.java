package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//백준 9012번 - 괄호
public class ex1 {
    public static String solution(String s){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(')  stack.push(c);
            else if (stack.isEmpty()) return "NO";
            else stack.pop();
        }

        if (stack.empty()) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            System.out.println(solution(sc.next()));	// nextLine()쓰면 안된다.
        }
    }
}
