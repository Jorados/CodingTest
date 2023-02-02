package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex8 {
    public static int BFS(int s,int e) {
        int L = 0;
        int[] ch = new int[10001];
        int[] len = {1, -1, 5};
        ch[s] = 1;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);
        while (!Q.isEmpty()) {
            int length = Q.size();
            for (int i = 0; i < length; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + len[j];
                    if(nx==e) return L+1;
                    if (nx>=1 && nx<=10000 && ch[nx] == 0) {
                        ch[nx] = 1;
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
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(BFS(s,e));
    }
}
