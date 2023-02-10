package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//송아지 찾기
public class ex8 {

    static int n,m;
    static int[] dis={1,-1,5};
    static int[] ch;

    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        int L=0;
        ch=new int[10001];
        ch[n]=1;
        Q.offer(n);
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Integer x = Q.poll();
                for(int j=0; j<dis.length; j++){
                    int nx = x + dis[j];
                    if(nx==m) return L+1;
                    if(nx>=1 && nx<=10000 && ch[nx]==0) {
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println(BFS());
    }
}
