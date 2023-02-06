package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//매출액의 종류
public class ex3 {
    public static int[] solution(int n,int m,int[] arr){
        int[] answer = new int[m];
        int lt=0,rt=0;
        int x=1;
        Map<Integer,Integer> map = new HashMap<>();
        while(rt<n){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            if(rt==m-1) answer[0]+=map.size();
            else if(rt>=m) {
                map.put(arr[lt],map.get(arr[lt])-1);
                if(map.get(arr[lt])==0) map.remove(arr[lt]);
                lt++;
                answer[x++] += map.size();
            }
            rt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : solution(n,m,arr)){
            System.out.print(x + " ");
        }
    }
}
