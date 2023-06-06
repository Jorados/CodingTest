package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소 회의실 개수 - G5 - 정렬

class Class implements Comparable<Class>{
    int st;
    int et;
    public Class(int st, int et) {
        this.st = st;
        this.et = et;
    }
    @Override
    public int compareTo(Class o) {
        if(this.st==o.st) return this.et - o.et;
        return this.st - o.st;
    }
}

public class ex19598 {
    public static int n;
    public static ArrayList<Class> arr = new ArrayList<>();
    public static int answer=0;

    public static void solution(){
        Collections.sort(arr);

        PriorityQueue<Integer> Q = new PriorityQueue<>();
        Q.add(0);
        for(Class x : arr){
            int et = Q.peek();
            if(x.st>=et) Q.poll();
            Q.add(x.et);
        }
        answer=Q.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int st = sc.nextInt();
            int et = sc.nextInt();

            arr.add(new Class(st,et));
        }

        solution();
        System.out.println(answer);
    }
}
