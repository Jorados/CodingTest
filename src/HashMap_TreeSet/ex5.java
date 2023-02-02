package HashMap_TreeSet;

import java.util.*;

public class ex5 {

    public static int solution(int n, int k, int[] arr){
        int answer =0;
        TreeSet<Integer> TSet = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int z=j+1; z<arr.length; z++){
                    TSet.add(arr[i]+arr[j]+arr[z]);
                }
            }
        }
        int cnt=0;
        for(int x : TSet){
            cnt++;
            if(cnt == k) answer=x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
