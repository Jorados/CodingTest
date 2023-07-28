package programmers;


import java.util.Scanner;

// 프로그래머스 - n진수 게임
public class nGame {
    static int n,t,m,p;
    static StringBuilder sb = new StringBuilder();
    static StringBuilder answer = new StringBuilder();
    public static void solution() {
        // 무조건 한번에 한 숫자만 말할수있다.
        // 다음 숫자가 12면 1,2 이렇게 말해야한다.

        // 0 [1] 1 [0] 1 [1] 1 [0] 0 ~
        for(int i=0; i<=t*m; i++){
            sb.append(Integer.toString(i,n));
        }

        for(int i=p-1; answer.length()<t; i+=m){
            char ctr = sb.charAt(i);
            answer.append(ctr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        t = sc.nextInt();
        m = sc.nextInt();
        p = sc.nextInt();

        solution();

        System.out.println(answer.toString().toUpperCase());
    }

}
