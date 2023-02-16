package Sorting_Searching;

import java.util.Scanner;

//뮤직비디오(결정알고리즘)
public class ex9 {
    public static int solution(int n,int m,int[] arr){
        int answer=0;
        int lt=arr[n-1]; int rt=0;
        for(int i=0; i<n; i++) rt += arr[i];

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=m){ //DVD 2개로도 되면, 3개로도 된다는뜻!
                answer=mid;
                rt=mid-1;
            }
            else lt=mid+1;
        }
        return answer;
    }

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
