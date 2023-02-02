package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;
//()(((()())(())()))(())
// --> 17
public class ex5 {
    public static int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x=='(') stack.push(x);
            else if(x==')'){
                if(stack.pop() == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));
    }
}
