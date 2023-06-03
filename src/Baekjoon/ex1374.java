package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 강의실 - G5 - 그리디,정렬

class Study implements Comparable<Study>{
    int num;
    int st;
    int et;

    public Study(int num,int st, int et){
        this.num = num;
        this.st = st;
        this.et = et;
    }

    @Override
    public int compareTo(Study o) {
        return this.st - o.st;
    }
}

public class ex1374 {

    static int n;
    static int cnt = 0;
    static ArrayList<Study> arr = new ArrayList<>();
    public static void solution(){
        Collections.sort(arr);

        PriorityQueue<Integer> Q = new PriorityQueue<>();
        Q.add(0);

        for(Study x : arr){
            int et = Q.peek();

            if(x.st >= et) Q.poll();
            Q.add(x.et);
        }
        cnt = Q.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            int st = sc.nextInt();
            int et = sc.nextInt();

            arr.add(new Study(num,st,et));
        }
        solution();
        System.out.println(cnt);
    }
}
