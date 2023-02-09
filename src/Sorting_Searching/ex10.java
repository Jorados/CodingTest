package Sorting_Searching;

import java.util.Scanner;

//마구간 정하기(결정알고리즘)
public class ex10 {
    public static int solution(int n,int m,int[] arr) {
        int answer=0;
        int lt=arr[0]; int rt=arr[n-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)>=m){
                answer=mid;
                lt=mid+1;
            }
            else rt=mid-1;
        }
        return answer;
    }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
