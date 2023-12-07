package Baekjoon;


import java.util.Scanner;
import java.util.Stack;

// 스택연습
public class ex28278 {

    static int n;
    static Stack<Integer> stack =  new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        while(n-->0){
            int num = sc.nextInt();
            if(num==1){
                int a = sc.nextInt();
                stack.push(a);
            }
            else if(num==2){
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                }
                else System.out.println(-1);
            }
            else if(num==3){
                System.out.println(stack.size());
            }
            else if(num==4){
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if(num==5){
                if(!stack.isEmpty()){
                    System.out.println(stack.peek());
                }
                else System.out.println(-1);
            }
        }
    }
}
