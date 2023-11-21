package Baekjoon;


import java.util.Scanner;

// 점프 점프
public class ex14248 {
    static int n;
    static int[] arr;
    static int st;
    static boolean[] ch;
    static int answer=0;

    public static void DFS(int idx){
        if(!ch[idx]){
            ch[idx]=true;
            for(int nx : new int[]{idx + arr[idx],idx - arr[idx]}){
                if(nx>=0 && nx<n && !ch[nx]){
                    DFS(nx);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        st = sc.nextInt()-1;
        ch = new boolean[n];

        DFS(st);
        for(boolean b : ch){
            if(b) answer++;
        }
        System.out.println(answer);
    }
}
