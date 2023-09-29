package CodingTest.Sorting;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 멀티태스킹 - 큐
public class ex6 {
    static Queue<Point> Q = new LinkedList<>();
    static int n,answer=0;
    static int[] tasks;
    static int k;
    public static void solution() {
        for(int i=0; i<tasks.length; i++){
            Q.offer(new Point(i+1,tasks[i]));
        }

        while(k>0){
            Point poll = Q.poll();
            if(poll.y==0) continue;
            else {
                Q.offer(new Point(poll.x,poll.y-1));
                k--;
            }
//            System.out.println( "남은 시간 " + k);
//            for(Point x : Q){
//                System.out.println("Q의 상태 " + x.x + " " + x.y);
//            }
//            System.out.println();
        }

        if(Q.size()==0) answer = -1;
        else{
            Point poll = Q.poll();
            if(poll.y==0) answer = Q.poll().x;
            else{
                answer = poll.x;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        tasks = new int[n];
        for(int i=0; i<n; i++){
            tasks[i] = sc.nextInt();
        }
        k = sc.nextInt();
        solution();
        System.out.println(answer);
    }
}
