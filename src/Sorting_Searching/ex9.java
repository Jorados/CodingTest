package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class ex9 {
    public static int count(int[] arr,int mid){
        int cnt=1,sum=0;
        for(int x : arr){
            if(sum+x>mid){
                cnt++;
                sum=x;
            }
            else sum+=x;
        }
        return cnt;
    }

    public static int solution(int n,int k, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)<=k){
                answer=mid;
                rt=mid-1;
            }
            else lt=mid+1;
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
