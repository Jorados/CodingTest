package Baekjoon;


import java.util.Scanner;
import java.util.Stack;

// 백준 - 괄호끼워넣기 - S3
public class ex11899 {
    public static int solution(String s){
        int answer=0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            Character c =s.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            else if(c==')' && stack.empty()){
                answer++;
            }
            else if(c==')' && stack.peek()=='('){
                stack.pop();
            }
        }
        if(!stack.empty()) answer+=stack.size();
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));
    }
}
