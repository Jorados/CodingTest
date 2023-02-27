package Baekjoon;


import java.util.Scanner;
import java.util.Stack;

//백준 1725 - 히스토그램
public class ex4 {

    //스택 2개의 사이즈가 같은 최대크기?
    public static int solution(int n,int[] arr){
        int answer=0;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int max=0;

        for(int i=0; i<arr.length; i++){
            if(i%2==1) {
                for(int j=1; j<=arr[i]; j++) {
                    stack1.push(j);
                }
            }
            else if(i%2==0){
                for(int j=1; j<=arr[i]; j++){
                    stack2.push(i);
                }
            }

            if(!stack1.isEmpty() && !stack2.isEmpty() && stack1.size() > stack2.size() && (stack2.size() * 2) > max){
                    max = stack2.size() * 2;
                    stack1.clear();
                    stack2.clear();
            }
            else if(!stack1.isEmpty() && !stack2.isEmpty() && stack1.size() < stack2.size() && (stack1.size() * 2) > max){
                    max = stack1.size() * 2;
                    stack1.clear();
                    stack2.clear();
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
