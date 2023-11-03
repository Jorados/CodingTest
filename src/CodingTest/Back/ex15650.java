package CodingTest.Back;


import java.util.Scanner;

public class ex15650 {

    static int n;
    static int m;
    static int[] ch;
    static boolean[] visited;


    public static void DFS(int L,int st){
        if(L==m){
            for(int x : ch){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        else{
            for(int i=st; i<=n; i++){
                if(!visited[i]){
                    visited[i]=true;
                    ch[L]=i;
                    DFS(L+1,i+1);
                    visited[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ch = new int[m];
        visited = new boolean[n+1];
        DFS(0,1);
    }
}
