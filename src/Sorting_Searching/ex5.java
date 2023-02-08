package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

//중복확인
public class ex5 {

    public static String solution(int n,int[] arr){
        String answer="U";
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]) return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,arr));
    }
}
