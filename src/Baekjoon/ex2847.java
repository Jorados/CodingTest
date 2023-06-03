package Baekjoon;


import java.util.Scanner;

// 게임을 만든 동준이 - S4
public class ex2847 {
    static int answer=0;
    static int n;
    static int[] arr;

    public static int solution(){
           for(int i=n-1; i>=1; i--){
               while(arr[i-1]>=arr[i]){
                   arr[i-1]--;
                   answer++;
               }
           }
           return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution());
    }
}
