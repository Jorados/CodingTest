package TwoPointers_SlidingWindow;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//두 배열 공통 원소 구하기 (오름차순) [ 투 포인터 ]
//5
//1 3 9 5 2
//5
//3 2 5 7 8
// --> 2 3 5
public class TS2 {
    public static ArrayList<Integer> solution(int n, int n2, int[] arr, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0,p2=0;

        Arrays.sort(arr);
        Arrays.sort(arr2);

        while(p1<n && p2<n2){
          if(arr[p1] == arr2[p2]){
              answer.add(arr[p1++]);
              p2++;
          }
          else if(arr[p1] < arr2[p2]) p1++;
          else if(arr[p1] > arr2[p2]) p2++;
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
