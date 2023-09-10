package CodingTest.Greedy;

import java.util.Arrays;
import java.util.Scanner;

// 그리디 - 이동 횟수
public class ex2 {

    static int n;
    static int[] arr;
    static int answer=0;

    public static void solution(){
        Arrays.sort(arr);
        int lt=0, rt=arr.length-1;
        while(lt <= rt) {
            int sum = arr[lt] + arr[rt];
            if(sum <= 5){
                answer++;
                lt++;
                rt--;
            }
            else if(sum > 5){
                answer++;
                rt--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        solution();
        System.out.println(answer);
    }
}
