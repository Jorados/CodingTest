package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 보물 - 1026 - 그리디
public class ex1026 {

    static int n;
    static int[] arr;
    static int[] brr;

    public static int solution(){
        int answer=0;

        Arrays.sort(arr);

        Integer[] brr2 = new Integer[n];
        for(int i=0; i<n; i++){
            brr2[i] = brr[i];
        }
        Arrays.sort(brr2,Collections.reverseOrder());

        int i=0;
        while(i<n){
            answer+= brr2[i]*arr[i];
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        brr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            brr[i] = sc.nextInt();
        }

        System.out.println(solution());
    }
}
