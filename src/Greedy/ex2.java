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
        if(o.et == this.et) return this.st - o.st;
        return this.et - o.et;
    }
}
public class ex2 {
    public static int solution(ArrayList<Time> arr){
        int answer=0;
        int endTime=Integer.MIN_VALUE;
        Collections.sort(arr);
        for(Time x : arr){
            if(x.st >= endTime){
                endTime = x.et;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr.add(new Time(st,et));
        }

        System.out.println(solution(arr));
    }
}
