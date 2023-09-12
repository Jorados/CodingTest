package CodingTest.Greedy;


import java.util.Scanner;

// 스프링 쿨러
public class ex3 {

    static int n,answer=0;
    static int[] arr;

    public static void solution(){
        int[] brr = new int[n];
        for(int i=0; i<n; i++){
            brr[i] = arr[i];
        }

        int max = Integer.MIN_VALUE;
        int range = 0;
        for(int i=0; i<arr.length; i++){
            // 가장 큰 값의 인덱스를 저장
            if(arr[i] > max){
                max = i;
                range = arr[i];
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        solution();
    }
}
