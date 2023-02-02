package Array;

import java.util.Scanner;

//10
//1 0 1 1 1 0 0 1 1 0
// --> 10
public class Array7 {
    public static int solution(int n,int[] arr){
        int answer =0;
        int p=0;
        for(int i=0; i<arr.length; i++){
               if(arr[i] == 1){
                   p++;
                   answer += p;
               }
               else if(arr[i]==0){
                   p=0;
               }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(solution(n,arr));
    }
}
