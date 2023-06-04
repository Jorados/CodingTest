package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 수리공 항승 - s3 - 정렬
public class ex1449 {

    static int n,m;
    static int[] arr;
    static int lt=0,rt=0;
    static int answer=1;
    public static void solution(){
        Arrays.sort(arr);

        while(rt<arr.length){
            if(arr[rt] - arr[lt] < m){
                rt++;
            }
            else if(arr[rt] - arr[lt] >= m){
                lt = rt;
                answer++;
            }
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution();
        System.out.println(answer);
    }
}
