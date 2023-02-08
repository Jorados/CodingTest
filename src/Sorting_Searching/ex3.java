package Sorting_Searching;

import java.util.Scanner;

//버블 정렬 -> 바로옆과 비교하면서 정렬
//1.겉 for 문 -> 라운드횟수
//2.안 for 문 -> arr[j]>arr[j+1]이면 바꾸면서 끝까지 가는데
//j+1과 비교하기때문에 맨뒷칸-1까지만 해야하고
//라운드가 지날수록 큰 값이 뒤에 고정되기 때문에 -i를 해줘야한다.
//j<n-i-1;
public class ex3 {
    public static int[] solution(int n,int[] arr) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
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
        int[] arr =  new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }

}
