package Sorting_Searching;


import java.util.Arrays;
import java.util.Scanner;

//장난 꾸러기
public class ex6 {
    public static int[] solution(int n, int[] arr){
        int[] answer = arr.clone();
        int[] cnt = new int[2];
        int a=0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(answer[i]!=arr[i]){
                cnt[a++] = i+1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
