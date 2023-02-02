package Sorting_Searching;


import java.util.Scanner;

//버블 정렬
public class ex2 {
    public static int[] solution(int n,int[] arr){
        int tmp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1])  {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
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
