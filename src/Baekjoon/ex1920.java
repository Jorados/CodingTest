package Baekjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 수 찾기 - S4 - 정렬
public class ex1920 {

    public static int binarySearch(int[] arr , int key){
        int lt=0;
        int rt=arr.length-1;

        while(lt<=rt){
            int mid = (lt+rt)/2;

            if(key<arr[mid]){
                rt = mid-1;
            }
            else if(key>arr[mid]){
                lt = mid+1;
            }
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열은 반드시 정렬되어있어야한다. -> 이분탐색 필수조건
        Arrays.sort(arr);

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
            int key = sc.nextInt();
            // 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
            if(binarySearch(arr,key) >= 0) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
