package CodingTest.Sorting;


import java.util.Arrays;
import java.util.Scanner;

// 심사위원
public class ex4 {

    static int n,k;
    static int[] arr;
    static int answer=Integer.MAX_VALUE;

    public static void soluiton(){
        Arrays.sort(arr);

        int sum=0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        System.out.println();
        if(Math.abs(arr[0] - arr[k-1]) <= 10) answer = Math.min(answer, sum/k);

        for(int i=k; i<arr.length; i++){
            sum+=(arr[i] - arr[i-k]);
            if(Math.abs(arr[i] - arr[i-k+1]) <= 10){
                answer = Math.min(answer, sum/k);
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

        k = sc.nextInt();

        soluiton();
        System.out.println(answer);
    }
}
