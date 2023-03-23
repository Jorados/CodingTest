package Baekjoon;

import java.util.Scanner;

public class ex1316 {
    public static int solution(int n, String[] arr){
        int answer=0;
        //이전에 나왔던 숫자가 연달아 나오는게 아니면 x
        for(String x : arr){
            char[] c = x.toCharArray();
            for(int i=0; i<c.length; i++){

            }
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        System.out.println(solution(n,arr));
    }
}
