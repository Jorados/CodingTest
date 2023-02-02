package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class ex10 {
    public static int count(int[] arr,int mid){
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=mid){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

    public static int solution(int n,int k, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];

        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)>=k){
                answer=mid;
                lt=mid+1;
            }
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
