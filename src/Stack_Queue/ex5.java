package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ex5 {

    public static int solution(String s){
        int answer=0;
        int pipe=0;
        Stack<Character> stack = new Stack<>();
        // '( )' 레이저가 발생하면 존재하는 쇠막대기를 자른다.
        // '(' 가 시작되면 쇠막대기 시작.
        // ')' 면 쇠막대기의 끝.
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                stack.pop();
                if(s.charAt(i-1)=='('){
                    answer+=stack.size();
                }
                else {
                    answer++;
                }
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
