package Recursive_Tree_Graph;

import java.util.Scanner;

public class ex2 {

    public static void solution(int n){
        if(n==0) return;
        solution(n/2);
        System.out.println(n%2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
