package Array;

import java.util.ArrayList;
import java.util.Scanner;

//9
//32 55 62 20 250 370 200 30 100
public class Array6 {

    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n,String arr[]){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i< arr.length; i++){
            String str = new StringBuffer(arr[i]).reverse().toString();
            int num = Integer.parseInt(str);
            if(isPrime(num)==true){
                answer.add(num);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }

}
