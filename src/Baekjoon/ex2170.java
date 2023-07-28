package Baekjoon;


import java.io.*;
import java.util.*;

// 선 긋기 - 정렬 - G5

class Line{
    long s;
    long e;
    public Line(long s,long e){
        this.s = s;
        this.e = e;
    }
}
public class ex2170 {
    static int n,answer=0;
    static ArrayList<Line> list;
    public static void solution(){
        list.sort(new Comparator<Line>() {
            @Override
            public int compare(Line o1, Line o2) {
                if (o1.s > o2.s) return 1;
                else if (o1.s == o2.s) {
                    if (o1.e > o2.e) return 1;
                }
                return -1;
            }
        });

        long lt=list.get(0).s;
        long rt=list.get(0).e;

        for(Line l : list){
            if(l.s < rt && l.e >=rt) {
                rt = l.e;
            }
            else if(l.s == rt){
                rt = l.e;
            }
            else if(l.s > rt){
                answer += (rt-lt);
                lt = l.s;
                rt = l.e;
            }
        }
        answer += (rt-lt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long s = Long.parseLong(st.nextToken());
            long e = Long.parseLong(st.nextToken());

            list.add(new Line(s,e));
        }
        solution();
        System.out.println(answer);
    }
}
