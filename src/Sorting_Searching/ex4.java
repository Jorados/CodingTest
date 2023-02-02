package Sorting_Searching;

import java.util.Scanner;
import java.util.Stack;

//5 9
//1 2 3 2 6 2 3 5 7
//->7 5 3 2 6
public class ex4 {

    public static int[] solution(int n, int k, int[] arr) {
        int[] array = new int[n];
        for(int x : arr){
            int pos =0;
            for(int i=0; i<n; i++){
                if(array[i] == x) pos=i;
            }

            //미스
            if(pos==0){
                for(int i=n-1; i>=1; i--){
                    array[i] = array[i-1];
                }
                array[0] = x;
            }
            //히트
            else{
                for(int i=pos; i>=1; i--){
                    array[i] = array[i-1];
                }
                array[0] = x;
            }


        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n,k,arr)) System.out.print(x + " ");
    }
}
