package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//백준 2812 - 크게만들기
public class ex2 {
    public static String solution(int n,int m,String s){
        String answer="";
        int cnt=m;
        //최솟값을 n만큼 빼기
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && cnt > 0 && stack.peek() < s.charAt(i)) {
                    stack.pop();
                    cnt--;
                }
            }
            else stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<stack.size(); i++){
            sb.append(stack.pop());
        }
        answer = sb.reverse().toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        System.out.println(solution(n,m,s));
    }
}
