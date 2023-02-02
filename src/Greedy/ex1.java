package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    int h;
    int w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h-this.h; //키 내림차순
    }
}
public class ex1 {
    static int max = Integer.MIN_VALUE;
    public static int solution(ArrayList<Body> arr , int n){
        int answer =0;
        Collections.sort(arr);
        for(Body x : arr){
            if(x.w> max){
                max =x.w;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h,w));
        }
        System.out.println(solution(arr,n));
    }
}
