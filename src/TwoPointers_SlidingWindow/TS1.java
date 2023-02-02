package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

//3
//1 3 5
//5
//2 3 6 7 9
// --> 1 2 3 3 5 6 7 9
public class TS1 {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0,p2=0;
        while(p1<n && p2<m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else if(a[p1] > b[p2]) answer.add(b[p2++]);
            else answer.add(b[p2++]);
        }

        //어느 한 쪽이 끝나는 경우
        while(p1<n){
            answer.add(a[p1++]);
        }
        while(p2<m){
            answer.add(b[p2++]);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        for(int x:solution(n,n2,arr,arr2)){
            System.out.print(x + " ");
        }
    }
}
