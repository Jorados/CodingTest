package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ex2 {

    public static String solution(String s){
        String answer="";
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.push(c)==')'){
                while(!stack.isEmpty()){
                    if(stack.pop()=='(') break;
                }
            }

        }
        for(int i=0; i<stack.size(); i++){
            answer+=stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
