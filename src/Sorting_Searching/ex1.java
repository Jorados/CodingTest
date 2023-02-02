package Sorting_Searching;

import java.util.Scanner;

public class ex1 {
    public static int[] solution(int n,int[] arr){
        int tmp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j])  {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
