package Dynamic;

import java.util.Scanner;

public class ex1 {
    static int answer=0;
    static int[] fibo;
    static public int solution(int n){
        fibo[1]=1;
        fibo[2]=2;
        for(int i=3; i<=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1 2 3 4 5 6 7
        //1 2 3 5 8 13 21
        fibo = new int[n+1];
        solution(n);
        System.out.println(fibo[n]);
    }
}
