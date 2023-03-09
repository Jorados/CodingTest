package Baekjoon;


import java.util.Scanner;
import java.util.Stack;

//백준 - 10773 - 스택 - 제로
public class ex10773 {
    public static int solution(int n, int[] arr){
        int answer=0;

        Stack<Integer> stack = new Stack<>();

        for(int x : arr){
            if(!stack.isEmpty() && x == 0){
                stack.pop();
            }
            else{
                stack.push(x);
            }
        }
        while(!stack.isEmpty()){
            answer+=stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
