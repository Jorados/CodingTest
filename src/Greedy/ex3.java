package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Clock implements Comparable<Clock>{
    int time;
    char state;
    public Clock(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Clock o) {
        if(this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}
public class ex3 {

    public static int solution(ArrayList<Clock> arr, int n) {
        int answer = Integer.MIN_VALUE;
        int cnt=0;
        Collections.sort(arr);
        for(Clock x : arr){
            if(x.state=='s') cnt++;
            else cnt--;
            answer=Math.max(answer,cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Clock> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr.add(new Clock(st, 's'));
            arr.add(new Clock(et,'e'));
        }
        System.out.println(solution(arr, n));
    }
}
