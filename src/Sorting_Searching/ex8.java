package Sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//이분 검색
public class ex8 {
    public static int solution(int n,int k, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt=0,rt=arr.length;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(k==arr[mid]){
                answer=mid+1;
            }
            if(k>arr[mid]) lt=mid+1;
            else rt=mid-1;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
