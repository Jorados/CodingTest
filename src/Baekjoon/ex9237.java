package Baekjoon;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 이장님 초대 - 그리디 - S5
public class ex9237 {

    public static int solution(int n,Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            cnt = Math.max(cnt,arr[i]+i+1);
        }
        cnt++; //다 자라고 다음날 이장님.

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,arr));
    }
}
