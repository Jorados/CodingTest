package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class ex3 {
    public static String solution(String s,String boom){
        String answer="";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));

            if(stack.size() >= boom.length()) {
                for(int j=0; j<boom.length(); j++){
                    Character pop = stack.pop();
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String boom = sc.next();

        System.out.println(solution(s,boom));
    }
}
