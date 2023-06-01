package Baekjoon;


import java.util.*;

// 도서관 - G5 - 정렬,그리디
public class ex1461 {
    static int n,m;
    static PriorityQueue<Integer> positiveQ = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> negativeQ = new PriorityQueue<>(Collections.reverseOrder());
    static int answer=0;

    public static void solution() {
        // 가장 큰 거리는 마지막에 빼줄거임 -> 이유는 마지막은 제자리로 돌아가지 않아도 됨.
        int maxV = 0;
        if(positiveQ.isEmpty()) maxV = negativeQ.peek();
        else if(negativeQ.isEmpty()) maxV = positiveQ.peek();
        else maxV = Math.max(positiveQ.peek(),negativeQ.peek());

        while(!positiveQ.isEmpty()){
            int dis = positiveQ.poll();
            for(int i=0; i<m-1; i++){
                positiveQ.poll();
                if(positiveQ.isEmpty()) break;
            }
            answer+=dis*2;
        }

        while(!negativeQ.isEmpty()){
            int dis = negativeQ.poll();
            for(int i=0; i<m-1; i++){
                negativeQ.poll();
                if(negativeQ.isEmpty()) break;
            }
            answer+=dis*2;
        }

        answer -= maxV;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=0; i<n; i++){
            int dis = sc.nextInt();
            if(dis>0) positiveQ.offer(dis);
            else negativeQ.offer(Math.abs(dis));
        }

        solution();
        System.out.println(answer);
    }
}
