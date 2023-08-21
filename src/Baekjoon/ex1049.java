package Baekjoon;

import java.util.Scanner;

// 기타줄 - 그리디
public class ex1049 {
    static int num , Brand2,answer=0;
    static int answer2=0,answer3=0;
    static int Pack,fee;
    static int LowP=Integer.MAX_VALUE, Low=Integer.MAX_VALUE;

    public static void solution(){

        int a = num / 6; // 패키지
        int b = num % 6; // 낱개

        answer+= (a*LowP) + (b*Low);

        answer2 += (a+1)*LowP;

        answer3 += num*Low;

        answer = Math.min(answer2,Math.min(answer,answer3));
    }


    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        num = sc.nextInt();
        Brand2 = sc.nextInt();


        for(int i=0; i<Brand2; i++){
            Pack = sc.nextInt();
            fee = sc.nextInt();

            LowP = Math.min(Pack,LowP);
            Low = Math.min(fee,Low);
        }
        solution();
        System.out.println(answer);
    }
}
