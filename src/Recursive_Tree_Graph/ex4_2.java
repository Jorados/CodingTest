package Recursive_Tree_Graph;

import java.util.Scanner;

public class ex4_2 {
    static int[] arr;
    public static int fibonacci(int n){
        if(arr[n]>0) return arr[n];

        if(n==1 || n==2) return arr[n]=1;
        else{
            return arr[n] = fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        fibonacci(n);
        for(int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
