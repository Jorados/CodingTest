package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

//크레인 인형뽑기(카카오)
public class ex3 {

    public static int solution(int n,int[][] arr,int m,int[] brr){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(int x : brr){
            for(int i=0; i<n; i++) {
                if (arr[i][x] != 0) {
                    stack.push(arr[i][x]);
                    while(!stack.isEmpty() && stack.size()>1){
                        Integer pop1 = stack.pop();
                        Integer pop2 = stack.pop();
                        if(pop1 == pop2) answer+=2;
                        else{
                            stack.push(pop2);
                            stack.push(pop1);
                        }
                        break;
                    }
                    arr[i][x] = 0;
                    break;
                }
            }
        }

        // 1 5 3 5 1 2 1 4
        // 4 3 1 1 3 2 0 4
        // 4 3 1 1 3 2 4 0
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n+1];
        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i=0; i<m; i++){
            brr[i] = sc.nextInt();
        }

        System.out.println(solution(n,arr,m,brr));
    }
}
