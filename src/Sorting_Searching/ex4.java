package Sorting_Searching;

import java.util.Scanner;
import java.util.Stack;

public class ex4 {
    public static int[] solution(int n,int m,int[] arr) {
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int x : arr) {
            if(stack.contains(x)){
                stack.remove(stack.indexOf(x));
                stack.push(x);
            }
            else{
                stack.push(x);
                if(stack.size()>n){
                    stack.remove(0);
                }
            }
        }
        for(int i=0; i<n; i++){
            answer[i] = stack.pop();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n,m,arr)){
            System.out.print(x + " ");
        }
    }
}
