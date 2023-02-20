package Dynamic;

import java.util.Scanner;

//돌다리 건너기
public class ex2 {

    static int[] fibo;
    public static int solution(int n){
        fibo[1]=1;
        fibo[2]=2;
        for(int i=3; i<=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n-1] + fibo[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fibo = new int[n+1];
        System.out.println(solution(n));

    }
}
