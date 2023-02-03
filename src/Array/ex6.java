package Array;

import java.util.ArrayList;
import java.util.Scanner;

//뒤집은 소수(중요함)
public class ex6 {

    public static boolean isPrime(int num){
        if(num==1) return false;
        else{
            for(int i=2; i<num; i++){
                if(num%i==0) return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n,String[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(String x : arr){
            StringBuffer sb = new StringBuffer(x);
            String rs = sb.reverse().toString();
            int a = Integer.parseInt(rs);
            answer.add(a);
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<answer.size(); i++){
            if(isPrime(answer.get(i))==true) al.add(answer.get(i));
        }

        return al;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }

        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
