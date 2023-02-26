package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//백준 2812 - 크게만들기
public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();

        int cnt=m;
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
        for(char c : stack){
            System.out.print(c + " ");
        }

        StringBuffer sb = new StringBuffer();
        for(char c: stack){
            sb.append(c);
        }


    }
}
