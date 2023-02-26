package Baekjoon;


import java.util.Scanner;

//백준 1725 - 히스토그램
public class ex4 {

    public static int solution(int n,int[] arr){
        int answer=0;


        return answer;
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
