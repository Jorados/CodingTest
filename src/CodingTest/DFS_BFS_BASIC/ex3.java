package CodingTest.DFS_BFS_BASIC;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기 - BFS
public class ex3 {
    static int n,m;
    static int answer=0;
    static boolean[] ch;
    static int[] dis = {1,-1,5};
    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(n);
        int L=0;
        while (!Q.isEmpty()){
            Integer size = Q.size();
            for(int i=0; i<size; i++){
                int poll = Q.poll();
                for(int j=0; j<3; j++){
                    int nx = poll + dis[j];
                    if(nx==m) return L+1;
                    if(nx>=1 && nx<=10000 && !ch[nx]){
                        ch[nx]=true;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new boolean[10001];

        System.out.println(BFS());
    }
}
