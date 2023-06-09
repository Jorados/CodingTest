package Baekjoon;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 좌표 압축 - S2 - 정렬
public class ex18870 {

    static int n;
    static int[] arr;

    public static void solution(){

        Map<Integer,Integer> map = new HashMap<>();
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);

        int cnt=0;
        for(int v : arr2){
            if(!map.containsKey(v)){
                map.put(v,cnt);
                cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(map.get(x)).append(' ');
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        solution();

    }
}
