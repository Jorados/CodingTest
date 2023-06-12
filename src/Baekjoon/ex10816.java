package Baekjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 숫자 카드2 - 정렬 - S4
public class ex10816 {

    static int n,m;
    static int[] arr;
    static int[] brr;

    // 최저 지점
    public static int lowerSearch(int[] arr,int key){
        int lt=0;
        int rt=arr.length;

        while(lt<rt){
            int mid = (lt+rt)/2;

            if(key<=arr[mid]) rt=mid;
            else lt=mid+1;
        }
        return lt;
    }

    // 초과 지점
    public static int upperSearch(int[] arr,int key){
        int lt=0;
        int rt=arr.length;

        while(lt<rt){
            int mid = (lt+rt)/2;

            if(key<arr[mid]) rt=mid;
            else lt=mid+1;
        }
        return lt;
    }
    public static void solution(){
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int x : brr){
            sb.append(upperSearch(arr,x) - lowerSearch(arr,x)).append(' ');
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        m = sc.nextInt();
        brr = new int[m];
        for(int i=0; i<m; i++){
            brr[i] = sc.nextInt();
        }

        solution();
    }
}
