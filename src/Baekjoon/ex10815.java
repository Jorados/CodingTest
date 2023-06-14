package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 숫자카드 - S5 - 정렬
public class ex10815 {
    static int n,m;
    static int[] arr;
    static int[] brr;


    public static boolean Search(int[] arr,int key){
        int lt = 0;
        int rt = arr.length-1;

        while(lt<=rt){
            int mid = (lt+rt)/2;

            if(key<arr[mid]) rt=mid-1;
            else if(key>arr[mid]) lt=mid+1;
            else return true;
        }

        return false;
    }
    public static void solution() {
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int x : brr){
            if(Search(arr,x) == true){
                sb.append('1').append(' ');
            }
            else{
                sb.append('0').append(' ');
            }
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
