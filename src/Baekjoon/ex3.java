package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

//백준 9935 문자열 폭발
public class ex3 {
    public static String solution(String s,String boom){
        String answer="";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
            if(stack.size() >= boom.length()) {
                boolean flag = true;
                for(int j=0; j<boom.length(); j++){
                    if(stack.get(stack.size()-boom.length() + j) != boom.charAt(j)){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    for(int j=0; j<boom.length(); j++){
                        stack.pop();
                    }
                }
            }
        }

        for(char ch : stack){
            sb.append(ch);
        }

        if(sb.length() > 0) answer=sb.toString();
        else answer="FRULA";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String boom = sc.next();

        System.out.println(solution(s,boom));
    }
}
