package Beakjoon_zaqabi;

import java.util.Scanner;


// 주몽 - S4
public class ex1940 {

    static int n,m;
    static int[] arr;

    public static int solution(){
        int answer=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==m) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution());

    }
}
