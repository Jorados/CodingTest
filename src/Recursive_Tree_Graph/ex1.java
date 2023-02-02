package Recursive_Tree_Graph;

import java.util.Scanner;
//3
// --> 1 2 3
public class ex1 {
    public static void solution(int n){
        if(n==0) return;
        else{
            solution(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
