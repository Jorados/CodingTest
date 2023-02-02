package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//회의실 배정
class Time implements Comparable<Time>{
    int st;
    int et;

    public Time(int st, int et) {
        this.st = st;
        this.et = et;
    }

    @Override
    public int compareTo(Time o) {
        return this.et-o.et; //키 내림차순
    }
}
public class ex2 {
    static int end = Integer.MIN_VALUE;

    public static int solution(ArrayList<Time> arr, int n) {
        int answer = 0;
        Collections.sort(arr);
        for (Time x : arr) {
            if (x.st >= end) {
                end = x.et;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr.add(new Time(st, et));
        }
        System.out.println(solution(arr, n));
    }
}
