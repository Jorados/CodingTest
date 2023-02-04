package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//공통원소구하기
public class ex2 {
    public static ArrayList<Integer> solution(int n, int[] arr, int m, int[] brr){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int p1=0,p2=0;
        while(p1<n && p2<m) {
            if (arr[p1] == brr[p2]) {
                answer.add(arr[p1]);
                p1++;
                p2++;
            }
            else if(arr[p1]>brr[p2]) p2++;
            else if(arr[p1]<brr[p2]) p1++;
        }
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
