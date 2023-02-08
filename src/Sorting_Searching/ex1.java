package Sorting_Searching;

import java.util.Scanner;


//선택정렬 -> 최솟값을 찾아서 앞자리에 넣기.
//1.겉 for 문 -> i인덱스부터 for문으로 돌면서,마지막은 자동정렬 -1
//2.안 for 문 -> 제일 작은 값의 j인덱스를 찾는다.
//3.두 인덱스값을 스위치.
public class ex1 {
    public static int[] solution(int n,int[] arr) {
        int min,temp;
        for(int i=0; i<n-1; i++){      // 1.마지막은 자동정렬.
            min=i;
            for(int j=i+1; j<n; j++){  // 2.
                if(arr[j]<arr[min]){   // 3.
                    min=j;
                }
            }
            //스왑.
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
