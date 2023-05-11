package Baekjoon;


import java.math.BigInteger;
import java.util.Scanner;

// 소음 - B3
public class ex2935 {

    static String s,s1,s2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        BigInteger a = new BigInteger(s);

        s1 = sc.next();

        s2 = sc.next();
        BigInteger b = new BigInteger(s2);

        if(s1.equals("*")){
            System.out.println(a.multiply(b));
        }else{
            System.out.println(a.add(b));
        }
    }
}
