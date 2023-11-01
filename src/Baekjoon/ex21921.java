package Baekjoon;


import java.util.Map;
import java.util.Scanner;

// 블로그
public class ex21921 {

    static int answer=0;
    static int answer2=1;
    static int n,m;
    static int[] arr;
    public static void solution(){
        int sum=0;
        for(int i=0; i<m; i++){
            sum += arr[i];
        }

        for (int i = m; i < arr.length; i++) {
            sum = (sum - arr[i-m]) + arr[i];
            if(sum==answer){
                answer2++;
            }
            else if(sum>answer) {
                answer = sum;
                answer2 = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution();

        if (answer == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(answer);
            System.out.println(answer2);
        }
    }
}
