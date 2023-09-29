package CodingTest.Sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소 회의실 개수
public class ex7 {

    static int n;
    static int[][] meetings;
    static int answer=1;

    public static void solution(){
        Arrays.sort(meetings, (a,b) -> a[0]==b[0] ? a[0]-b[0] : a[1]-b[1]);

        // 회의시간이 가장 빠르게 끝나는 순으로 정렬
        // 2 5
        // 0 10
        // 5 15
        // 12 25
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(meetings[0][1]);

        // pq : 5
        for(int i=1; i<meetings.length; i++){
            if(!pq.isEmpty() && pq.peek()<=meetings[i][0]){
                pq.poll();
            }
            pq.offer(meetings[i][1]);
            answer = Math.max(answer,pq.size());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        meetings = new int[n][2];
        for(int i=0; i<n; i++){
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }
        solution();
        System.out.println(answer);
    }
}
