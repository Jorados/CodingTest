package HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ex3 {
    public static ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        //1.먼저 k-1만큼을 map에 담아 놓는다
        //2.lt,rt를 이용해서 슬라이딩 방식으로 민다.

        int lt=0, rt=0;

        for(int i=0; i<k-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(rt=k-1; rt<n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0) + 1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }
            lt++;
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
