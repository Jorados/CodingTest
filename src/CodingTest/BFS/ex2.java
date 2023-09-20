package CodingTest.BFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 집으로 이동
public class ex2 {
    static int n;
    static int[] pool;
    static int a;
    static int b;
    static int home;
    static int answer=0;
    static boolean[] ch;
    static boolean flag = false;
    public static int BFS(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<pool.length; i++){
            list.add(pool[i]);
        }
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(0);
        ch[0] = true;
        while (!Q.isEmpty()){
            int size = Q.size();
            answer++;
            for(int i=0; i<size; i++){
                Integer poll = Q.poll();
                for(int xy : new int[] {poll+a,poll-b}) {
                    int nx = xy;
                    if (nx == home) return answer;
                    if (nx>=0 && nx <= 10001 && !ch[nx]) {
                        ch[nx] = true;
                        Q.offer(nx);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        pool = new int[n];
        for(int i=0; i<n; i++){
            pool[i] = sc.nextInt();
        }
        ch = new boolean[10001];
        a = sc.nextInt();
        b = sc.nextInt();
        home = sc.nextInt();

        int bfs = BFS();
        System.out.println(bfs);
    }
}
