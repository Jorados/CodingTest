package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 백준 - 강의실 배정 - G5


class Dot implements Comparable<Dot> {
    int st;
    int et;

    public Dot(int st, int et) {
        this.st = st;
        this.et = et;
    }
    @Override
    public int compareTo(Dot o) {
        if(this.st== o.st) return this.et - o.et;
        return this.st - o.st;
    }
}

public class ex11000 {
    static int n;
    static ArrayList<Dot> arr = new ArrayList<>();
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static int solution(){
        Collections.sort(arr);

        pq.offer(arr.get(0).et);

        for(int i=1; i<n; i++){
            if(pq.peek() <= arr.get(i).st) pq.poll();
            pq.offer(arr.get(i).et);
        }
        return pq.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(new Dot(a,b));
        }
        System.out.println(solution());
    }
}
