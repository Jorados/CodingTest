package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ex4 {

    public static int solution(String s){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) stack.push(c-48);
            else{
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                if(c=='+') stack.push(pop2+pop1);
                if(c=='-') stack.push(pop2-pop1);
                if(c=='*') stack.push(pop2*pop1);
                if(c=='/') stack.push(pop2/pop1);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}
