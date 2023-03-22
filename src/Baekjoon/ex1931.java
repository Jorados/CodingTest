package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 백준 - 회의실 배정 - S1
class Room implements Comparable<Room>{
    int st;
    int et;
    public Room(int st, int et) {
        this.st = st;
        this.et = et;
    }
    @Override
    public int compareTo(Room o) {
        if(this.et == o.et) return this.st - o.st;
        return this.et - o.et; //오름차순
    }
}
public class ex1931 {
    static int n;
    static ArrayList<Room> arr = new ArrayList<>();
    public static int solution() {
        int answer=0;
        Collections.sort(arr);
        int end = Integer.MIN_VALUE;
        for(Room x : arr){
            if(x.st >= end){
                end = x.et;
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(new Room(a,b));
        }
        System.out.println(solution());
    }
}
