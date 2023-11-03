package CodingTest.Back;


import java.util.Scanner;

public class ex15651 {
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
                ch[L]=i;
                DFS(L+1,i);
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
