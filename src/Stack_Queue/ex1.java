package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ex1 {
    public static String solution(String s){
        String answer ="YES";
        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) answer = "NO";
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) answer="NO";


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));
    }
}
