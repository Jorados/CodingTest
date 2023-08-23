package Baekjoon;


import java.util.Scanner;
import java.util.Stack;

// 안정적인 문자열 - 그리디 - S1
public class ex4889 {
    static String str="";
    static int cnt=1;

    public static int solution(){
        int answer=0;
        int num=0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='{'){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)=='}'){
                if(stack.isEmpty()){
                    num++;
                    stack.push('{');
                }
                else{
                    stack.pop();
                }
            }
        }
        return answer=num+stack.size()/2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(true){
            str = sc.next();
            if(str.contains("-")) break;
            solution();
            System.out.println(cnt + ". " + solution());
            cnt++;
        }

    }
}
