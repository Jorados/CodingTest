package DFS_BFS;


import java.util.Scanner;

//순열 구하기
public class ex6 {
    static int n,m;
    static int[] answer,arr,ch;
    public static void DFS(int L){
        if(L==m){
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i=n; i<=n*n; i=i+n){
                if(ch[i]==0){
                    ch[i]=1;
                    answer[L]=i;
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        answer = new int[m];
        ch = new int[200];
        DFS(0);
    }
}
