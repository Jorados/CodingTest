package Beakjoon_zaqabi;


import java.util.Scanner;
import java.util.Stack;

// 균형잡힌 세상 - 4949
public class ex4949 {

    public static String  solution(String s){
        String answer="yes";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }

            if(s.charAt(i)==')'){
                if(stack.isEmpty() || stack.peek() !='('){
                    return "no";
                }
                else stack.pop();
            }
            else if(s.charAt(i) == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else stack.pop();
            }
        }

        if(!stack.isEmpty()) return "no";
        else return "yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        while(true){
            s=sc.nextLine();

            if(s.equals(".")) break;
            System.out.println(solution(s));
        }

    }
}
