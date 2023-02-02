package Greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//최대수입 스케줄
class Lecture implements Comparable<Lecture>{
    int money;
    int day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day -this.day;
    }
}


public class ex4 {
    static int max=Integer.MIN_VALUE;
    public static int solution(ArrayList<Lecture> arr , int n){
        int answer=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for( ; j<n; j++){
                if(arr.get(j).day < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            arr.add(new Lecture(money,day));
            if(day>max) max=day;
        }
        System.out.println(solution(arr, n));
    }
}
