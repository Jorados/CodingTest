package CodingTest.Back;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex15654 {

    static int n;
    static int[] arr;
    static int m;
    static int[] ch;
    static boolean[] visit;

    public static void DFS(int L){
        if(L==m){
            for(int x : ch){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        else{
            for(int i=0; i<arr.length; i++){
                if(!visit[arr[i]]){
                    visit[arr[i]] = true;
                    ch[L] = arr[i];
                    DFS(L+1);
                    visit[arr[i]] = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        m = sc.nextInt();
        ch = new int[m];

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        visit = new boolean[10001];

        DFS(0);
    }
}
