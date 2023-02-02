package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ex4 {
    public static int solution(String s){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) stack.push(x-48);
            else {
                Integer a = stack.pop();
                Integer b = stack.pop();

                if(x=='+') stack.push(b+a);
                else if(x=='-') stack.push(b-a);
                else if(x=='*') stack.push(b*a);
                else if(x=='/') stack.push(b/a);
            }
        }
        answer = stack.pop();

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));
    }
}
