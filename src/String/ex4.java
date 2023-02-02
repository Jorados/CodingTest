package String;

import java.util.Scanner;

//단어뒤집기
public class ex4 {
    public static void solution(int n,String[] arr){
            for(String s : arr){
                StringBuilder ss = new StringBuilder(s);
                String s1 = ss.reverse().toString();
                System.out.println(s1);
            }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.next();
        }
        solution(n,arr);
    }
}
