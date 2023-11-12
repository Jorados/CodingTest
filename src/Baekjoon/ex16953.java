package Baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// A -> B
public class ex16953 {

    static Long n;
    static Long m;
    static boolean[] ch;
    public static int BFS(){
        Queue<Long> Q = new LinkedList<>();
        Q.offer(n);

        int L=1;
        while (!Q.isEmpty()){
            int size = Q.size();
            for(int i=0; i<size; i++){
                long poll = Q.poll();
                for(long nx : new long[]{poll*2,Long.valueOf(Long.valueOf(Long.toString(poll)+"1"))}){
                    if(nx == m) return L+1;
                    if(nx<=m && nx>=1){
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextLong();

        System.out.println(BFS());
    }
}
