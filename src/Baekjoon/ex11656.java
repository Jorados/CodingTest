package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 접미사 배열 - S4 - 정렬
public class ex11656 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            String str = s.substring(i, s.length());
            arr.add(str);
        }

        Collections.sort(arr);
        for(String x : arr){
            System.out.println(x);
        }
    }
}
