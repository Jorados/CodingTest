package DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 3 2
// 3 6 9
public class ex6 {
    static int n=0,m=0;
    static int[] answer;
    static int[] ch;

    public static void DFS(int L,int[] arr){
        if(L==m){
            for(int x : answer) System.out.println(x);
        }
        else{
            for(int i=0; i<n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    answer[L]=arr[i];
                    DFS(L+1,arr);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        answer = new int[m];
        ch = new int[n];
        DFS(0,arr);
    }
}
