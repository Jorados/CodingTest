package Baekjoon;


import java.util.Scanner;

// 모든 순열
public class ex10974 {
    static int n;
    static int[] answer;
    static boolean[] ch;
    public static void DFS(int L){
        if(L==n){
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        else{
            for(int i=1; i<=n; i++){
                if(!ch[i]){
                    ch[i]=true;
                    answer[L]=i;
                    DFS(L+1);
                    ch[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        answer = new int[n];
        ch = new boolean[n+1];
        DFS(0);
    }
}
