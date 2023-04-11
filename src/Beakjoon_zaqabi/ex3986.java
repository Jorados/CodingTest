package Beakjoon_zaqabi;


import java.util.Scanner;
import java.util.Stack;

// 좋은 단어 - S4
public class ex3986 {

    //스택이 남아있으면 false
    static int n;
    static String[] arr;
    static Stack<Character> stack = new Stack<>();
    public static int solution(){
        int answer=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(!stack.isEmpty() && stack.peek()==arr[i].charAt(j)){
                    stack.pop();
                }
                else stack.push(arr[i].charAt(j));
            }
            if(stack.size()==0) answer++;
            stack.clear();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        System.out.println(solution());
    }
}
