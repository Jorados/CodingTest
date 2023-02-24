package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ex6_2 {

    public static boolean isPrime(int num){
        if(num==1) return false;
        else {
            for(int i=2; i<num; i++){
                if(num%i==0) return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> solution(int n,int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int x : arr){
            String xNum = Integer.toString(x);
            StringBuilder sb = new StringBuilder(xNum);
            String s = sb.reverse().toString();
            int num = Integer.parseInt(s);
            answer.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int x : answer){
            if(isPrime(x)==true){
                result.add(x);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
