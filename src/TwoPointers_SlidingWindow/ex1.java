package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//두 배열 합치기
public class ex1 {
    public static ArrayList<Integer> solution(int n,int[] arr,int m,int[] brr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            answer.add(arr[i]);
        }

        for(int i=0; i<m; i++){
            answer.add(brr[i]);
        }
        Collections.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i=0; i<m; i++){
            brr[i] = sc.nextInt();
        }

        for(int x : solution(n,arr,m,brr)){
            System.out.print(x + " ");
        }
    }
}
