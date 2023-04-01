package Beakjoon_zaqabi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 일곱난쟁이 - B1
public class ex2309 {
    static int lt=0;
    static int rt=0;
    public static int[] solution(int[] arr){
        int cnt=0;
        for(int i=0; i<9; i++) cnt+=arr[i];
        cnt-=100;
        Arrays.sort(arr);


        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(arr[i]+arr[j]==cnt){
                    lt = arr[i];
                    rt = arr[j];
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for(int i=0; i<9; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<solution(arr).length; i++){
            if(arr[i]==lt || arr[i]==rt) continue;
            System.out.println(arr[i]);
        }
    }
}
