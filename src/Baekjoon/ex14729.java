package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 칠무해
public class ex14729 {
    static int n;
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            String str =  sc.next();
            String sub1 = str.substring(0, 2);
            String sub2 = str.substring(3, str.length());
            String total = sub1 + sub2;
            list.add(total);

        }

        Collections.sort(list);
        for(int i=0; i<7; i++){
            String num = list.get(i);
            String sub1 = num.substring(0, 2);
            String sub2 = num.substring(3, num.length());
            System.out.println(sub1 + "." + sub2);
        }
    }
}
