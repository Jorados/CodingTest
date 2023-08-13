package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 백준 숫자고르기 - DFS
public class ex2668 {
    static int n;
    static boolean[] isVisited;
    static ArrayList<Integer> list =  new ArrayList<>();
    static int[] arr;

    public static void solution(){
        for(int i=1; i<=n; i++){
            isVisited[i]=true;
            DFS(i,i);
            isVisited[i]=false;
        }
    }

    // 1 2 3 4 5 6 7
    // 3 1 1 5 5 4 6
    public static void DFS(int start,int target){
        if(arr[start] == target) list.add(start);

        if(!isVisited[arr[start]]){
            isVisited[arr[start]] = true;
            DFS(arr[start],target);
            isVisited[arr[start]] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        isVisited = new boolean[n+1];

        solution();

        System.out.println(list.size());
        Collections.sort(list);
        for(int x : list){
            System.out.println(x);
        }
    }
}
