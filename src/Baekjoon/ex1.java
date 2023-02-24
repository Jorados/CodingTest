package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//백준 9012번
public class ex1 {
    public static ArrayList<String> solution(int n,String[] arr){
        ArrayList<String> answer = new ArrayList<>();

        Stack<Character> stack = new Stack<>();

        for(String s : arr){
            for(char ch : s.toCharArray()){
                if(ch=='(') stack.push(ch);
                else if(stack.isEmpty() && ch==')') {
                    answer.add("NO");
                    stack.clear();
                    break;
                }
                else if(!stack.isEmpty() && ch==')') stack.pop();
            }
            if(stack.isEmpty()) answer.add("YES");
            else if(!stack.isEmpty()) answer.add("NO");
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr =new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        for(String x : solution(n,arr)){
            System.out.println(x);
        }
    }
}
