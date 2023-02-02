package Recursive_Tree_Graph;

import java.util.Scanner;

public class ex4 {
    public static int fibonacci(int n){
        if(n==1 || n==2) return 1;
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
