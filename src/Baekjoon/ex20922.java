package Baekjoon;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 겹치는 건 싫어
public class ex20922 {
    static int n,k,answer=0;
    static int[] arr;
    static Map<Integer,Integer> map = new HashMap<>();
    public static void solution() {
        // 3 2 5 5 6 4 4 5 7

        // 3:1 2:1 5:2 6:1 4:2  -> max = 7
        // 3:1 2:1 5:3 6:1 4:2  -> max != 8 --> k초과.
        // 3:0 2:1 5:3 6:1 4:2 -> max != 7 --> k초과
        // 3:0 2:0 5:3 6:1 4:2 -> max != 7 --> k초과
        // 3:0 2:0 5:2 6:1 4:2 -> max = 5
        // 3:0 2:0 5:2 6:1 4:2 7:1 -> max = 6

        // 따라서 최고 K=2를 넘지 않는 최고길이는 7.

        // map을 써줘야함.

        int lt=0;
        for(int rt=0; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);

            while (map.get(arr[rt]) > k ){
                map.put(arr[lt],map.get(arr[lt])-1);
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution();
        System.out.println(answer);
    }
}
