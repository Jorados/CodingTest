package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2>{
    int time;
    char state;

    public Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time2 o) {
        if(this.time == o.time) return this.state - o.state;
        return this.time - o.time;
    }
}

public class ex3 {

    public static int solution(ArrayList<Time2> arr){
        int answer=0;
        int cnt=0;
        Collections.sort(arr);
        for(Time2 x : arr){
            if(x.state=='s') cnt++;
            else cnt--;
            answer = Math.max(answer,cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr.add(new Time2(st,'s'));
            arr.add(new Time2(et,'e'));
        }

        System.out.println(solution(arr));
    }
}
