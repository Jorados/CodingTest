package programmers;


import java.util.Scanner;
import java.util.*;

public class isPrime {
    static int n,k;
    static int answer=0;

    public static boolean isPrime(long num){
        if(num<2) return false;
            // 에라토스테네스의 체로 체크할때 절반(제곱근)까지만 가줘도 된다.
        else{
            for(int i=2; i<=(int)Math.sqrt(num); i++){
                if(num%i==0) return false;
            }
        }
        return true;
    }
    public static void solution(){
        String num = Integer.toString(n,k);

        String prime="";
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) != '0'){
                prime += num.charAt(i);
            }
            else if(num.charAt(i) == '0' && !prime.equals("")){
                if(isPrime(Long.parseLong(prime)) == true){
                    answer++;
                }
                prime="";
            }
        }
        // 마지막 남아있는 경우
        if(!prime.equals("") && isPrime(Long.parseLong(prime))==true){
            answer++;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        solution();
        System.out.println(answer);

    }
}
