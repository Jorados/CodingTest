package Baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class ex1822 {
    static int n,m;
    static TreeSet<Integer> answer = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int i,num;

        for(i=0; i<n; i++){
            answer.add(sc.nextInt());
        }
        for(i=0; i<m; i++){
            num=sc.nextInt();
            if(answer.contains(num)) answer.remove(num);
        }

        System.out.println(answer.size());
        for(int n : answer){
            System.out.print(n + " ");
        }
    }
}
