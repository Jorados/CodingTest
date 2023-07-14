package programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int kg;
    int count;
    public Point(int kg, int count){
        this.kg = kg;
        this.count = count;
    }
}

public class truck {
    static int bridge_length;
    static int weight;
    static int[] wait;
    static int answer=0;
    public static void solution(){
         int bridge_w=0;
        Queue<Point> Q = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();

        for(int x : wait) Q2.offer(x);

        Integer poll = Q2.poll();
        Q.offer(new Point(poll,1));

        while(!Q.isEmpty()){
            answer++;

            for(Point x : Q) {
                x.count++;
                if(x.count > bridge_length) {
                    Point poll2 = Q.poll();
                    bridge_w -= poll2.kg;
                    break;
                }
            }

            if(bridge_w<weight && Q2.size()>0){
                if(bridge_w + Q2.peek() <= weight){
                    Integer tmp = Q2.poll();
                    Q.offer(new Point(tmp,1));
                    bridge_w += tmp; //x=트럭의 무게
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        bridge_length = sc.nextInt();
        weight = sc.nextInt();

        wait = new int[10];
        for(int i=0; i<10; i++){
            wait[i] = sc.nextInt();
        }

        solution();
        System.out.println(answer+1);
    }
}
