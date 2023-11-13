package Baekjoon;


import java.util.Scanner;

// 차이를 최대로
public class ex10819 {

    static int n;
    static int[] arr;
    static boolean[] ch;
    static int answer=Integer.MIN_VALUE;
    static int[] dis;
    public static void DFS(int L) {
        if(L==n){
            // 계산
            int sum=0;
            for(int i=1; i<n; i++){
                sum += Math.abs(dis[i-1] - dis[i]);
            }
            answer = Math.max(answer,sum);
        }
        else{
            for(int i=0; i<n; i++){
                if(!ch[i]){
                    ch[i] = true;
                    dis[L] = arr[i];
                    DFS(L+1);
                    ch[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ch = new boolean[n];
        dis = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        DFS(0);
        System.out.println(answer);
    }
}
