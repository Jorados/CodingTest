package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 두 수의 합 - S3 - 정렬
public class ex3273 {

    static int n,sum;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sum = sc.nextInt();

        Arrays.sort(arr);
        int answer=0;
        int lt = 0;
        int rt = arr.length-1;

        while(lt<rt){
            if( (arr[lt]+arr[rt]) == sum){
                answer++;
                lt++; rt--;
            }
            else if( (arr[lt]+arr[rt]) < sum){
                lt++;
            }
            else if( (arr[lt]+arr[rt]) > sum){
                rt--;
            }
        }
        System.out.println(answer);
    }
}
