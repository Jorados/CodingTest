package CodingTest.Greedy;

import java.util.Arrays;
import java.util.Scanner;

//침몰하는 타이타닉
public class ex1 {
    static int n;
    static int[] arr;
    static int m;
    static int answer=0;
    public static void solution(){
        int lt=0, rt=arr.length-1;
        Arrays.sort(arr);

        while(lt<=rt){
            int sum = arr[lt] + arr[rt];
            if(sum <= m){
                answer++;
                lt++;
                rt--;
            }
            else if(sum > m){
                answer++;
                rt--;
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
        m  =sc.nextInt();
        solution();
        System.out.println(answer);
    }
}
