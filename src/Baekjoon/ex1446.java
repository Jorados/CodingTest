package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 지름길

class Load implements Comparable<Load>{
    int start;
    int end;
    int range;
    int dif;
    public Load(int start,int end,int range,int dif){
        this.start = start;
        this.end = end;
        this.range = range;
        this.dif = dif;
    }

    @Override
    public int compareTo(Load o){
        if(this.start==o.start) return o.dif - this.dif;
        return this.start - o.start;
    }
}
public class ex1446 {
    static int n,dis,answer=0;
    static ArrayList<Load> list;
    public static void solution(){
        int cnt=0;

        for(Load x : list){
            System.out.println(x.start + " " + x.end + " " + x.range + " " + x.dif);
        }
        while(cnt < dis){
            // cnt == start,end
            boolean flag = false;
            for(Load x : list){
                if(x.start == cnt && (x.end-x.start) > x.range && x.end <= dis){
                    cnt = x.end;
                    answer += x.range;
                    flag = true;
                }
            }
            if(!flag) {
                cnt++;
                answer++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 지름길 수
        dis = sc.nextInt(); // 거리

        list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int range = sc.nextInt();

            int dif = end - start;

            // start,end 대비 range가 짧은 순으로 정렬해야함
            list.add(new Load(start,end,range,dif));
        }
        Collections.sort(list);
        solution();
        System.out.println(answer);
    }
}
