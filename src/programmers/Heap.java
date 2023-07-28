package programmers;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Heap {
    static int k;
    static int[] scoville;
    static int answer=0;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void solution(){
        for(int i=0; i<scoville.length; i++) pq.offer(scoville[i]);

        while(pq.peek()<k){
            //계속 돌리다가 하나남아서 k를 못넘기는 경우 -> -1출력
            if(pq.size()==1){
                answer=-1;
                break;
            }
            else {
                int socv = pq.poll() + (pq.poll() * 2);
                pq.offer(socv);
                answer++;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        scoville = new int[6];
        for(int i=0; i<6; i++) {
            scoville[i] = sc.nextInt();
        }
        k = sc.nextInt();
        solution();
        System.out.println(answer);

    }
}
