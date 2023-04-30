package Baekjoon;


import java.util.Scanner;
import java.util.Stack;


// 단어 뒤집기 - S3
public class ex17413 {

    static Stack<Character> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    public static void solution(String s){
        String answer="";
        boolean flag=false;

        for(char ch : s.toCharArray()){
            if(ch=='<'){
                flag=true;
                while(!stack.isEmpty())  sb.append(stack.pop());
                sb.append("<");
            }
            else if(ch=='>'){
                flag=false;
                sb.append(">");
            }
            else if(ch==' '){
                while(!stack.isEmpty()) sb.append(stack.pop());
                sb.append(" ");
            }
            else{
                if(flag == false) stack.push(ch);
                else sb.append(ch);
            }
        }
        while(!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        String s = sc.nextLine();
        solution(s);
    }

}
