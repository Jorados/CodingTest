package Greedy;


//최대수입 스케줄 ( PriorityQueue 응용 )

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int money;
    int day;

    public Lecture(int money,int day){
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        if(this.money == o.money) return o.day-this.day;
        return o.money-this.money;
    }
}
public class ex4 {
    static int max = Integer.MIN_VALUE;
    static int n;
    public static int solution(ArrayList<Lecture> arr){
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        int answer=0;
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for(; j<n; j++){
                if(arr.get(j).day < i) break;
                PQ.offer(arr.get(j).money);
            }
            answer += PQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Lecture> arr = new ArrayList<>();
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int money = sc.nextInt();
            int day = sc.nextInt();
            arr.add(new Lecture(money,day));
            if(day>max) max=day;
        }
        System.out.println(solution(arr));
    }

}
