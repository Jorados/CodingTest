package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//씨름 선수

class Body implements Comparable<Body>{
    int h;
    int w;
    public Body(int h,int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        if(this.h == o.h) return o.w - this.w;
        return o.h - this.h;
    }
}

public class ex1 {
    public static int solution(ArrayList<Body> arr){
        int answer=0;
        int bw=Integer.MIN_VALUE;
        Collections.sort(arr);

        for(Body x : arr){
            if(x.w > bw) {
                bw = x.w;
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h,w));
        }

        System.out.println(solution(arr));
    }
}
