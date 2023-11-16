package Baekjoon;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 수 묶기
public class ex1744 {

    static int n;
    static PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
    static long answer=0;
    public static void solution(){
        while(!pq.isEmpty()){
            if(pq.size()>=2 && pq.peek()>0){
                Long poll1 = pq.poll();
                if(pq.peek()>1){
                    Long poll2 = pq.poll();
                    answer+=poll1*poll2;
                }
                else if(pq.peek()==1){
                    Long poll2 = pq.poll();
                    answer+=poll1;
                    answer+=poll2;
                }
                else if(pq.peek()==0){
                    answer+=poll1;
                }
                else if(pq.peek()<0){
                    Long poll2 = pq.poll();
                    answer+=poll1;
                    answer+=poll2;
                }
            }
            else if(pq.size()>=2 && pq.peek()==0){
                Long poll1 = pq.poll();
                Long poll2 = pq.poll();
                answer += poll1*poll2;
            }
            // 남은 0,1 에 대한 처리를 확실하게 해줘야한다.
            else{
                Long poll = pq.poll();
                answer+=poll;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            pq.offer(sc.nextLong());
        }
        solution();
        System.out.println(answer);
    }
}
