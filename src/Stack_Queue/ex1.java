package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ex1 {

    public static String solution(String s){
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(') stack.push(c);
            else if(stack.isEmpty() && c==')') return "NO";
            else if(!stack.isEmpty() && c==')') stack.pop();
        }
        if(stack.size()==0) return "YES";
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
