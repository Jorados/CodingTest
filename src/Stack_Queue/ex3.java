package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;
//5
//0 0 0 0 0
//0 0 1 0 3
//0 2 5 0 1
//4 2 4 4 2
//3 5 1 3 1
//8
//1 5 3 5 1 2 1 4
public class ex3 {
    public static int solution(int n,int[][] arr,int k,int[] moves){
        int answer =0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<arr.length; i++){
                if(arr[i][pos-1] !=0) {
                    int tmp = arr[i][pos - 1];
                    arr[i][pos - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int[] moves = new int[k];
        for(int i=0; i<k; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n,arr,k,moves));
    }
}
