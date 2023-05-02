package Baekjoon;


import java.util.Scanner;

// 동전 - 11047
public class ex11047 {
    static int n,m;
    static int[] coin;

    public static int solution(){
        int answer=0;

        for(int i=n-1; i>=0; i--){
            if(coin[i] <= m){
                answer += m/coin[i]; //최대한 큰값으로 나누고
                m %= coin[i]; //나머지 저장하고
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        n = sc.nextInt(); //동전의 수
        m = sc.nextInt(); //동전의 합

        coin = new int[n];
        for(int i=0; i<n; i++){
            coin[i] = sc.nextInt();
        }

        System.out.println(solution());
    }
}
