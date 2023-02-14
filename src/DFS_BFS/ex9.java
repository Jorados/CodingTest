package DFS_BFS;

import java.util.Scanner;


//  1       2      3     4
//2 3 4    3 4     4     x
//DFS 이렇게 뻗는다.
public class ex9 {
    static int n,m;
    static int ch[],answer[];
    public static void DFS(int L,int s){
        if(L==m) {
            for(int x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i=s; i<=n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    answer[L]=i;
                    //앞에 들렸던곳 안들리게.
                    //두번 째 숫자가 더 크게.
                    DFS(L+1,i+1);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        ch = new int[n+1];
        DFS(0,1);
    }
}
