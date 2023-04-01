package Beakjoon_zaqabi;


import java.util.Scanner;

// 알파벳 개수 - B4
//숫자 0 = 48, 대문자 A = 65, 소문자 a = 97
public class ex10808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[(int)s.charAt(i)-97] +=1;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
