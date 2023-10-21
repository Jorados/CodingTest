package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 나무자르기 - 정렬

class Wood implements Comparable<Wood>{
    int len;
    int grow;
    public Wood(int len,int grow) {
        this.len = len;
        this.grow = grow;
    }

    @Override
    public int compareTo(Wood o){
        if(this.grow == o.grow) return this.len - o.len;
        return this.grow - o.grow;
    }
}
public class ex14247 {

    static int n;
    static int[] arr;
    static int[] brr;
    static ArrayList<Wood> list = new ArrayList<>();

    static long answer=0;
    public static void solution() {
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            answer += list.get(i).len + ( i * list.get(i).grow );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr= new int[n];
        brr =  new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            brr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            list.add(new Wood(arr[i],brr[i]));
        }

        solution();
        System.out.println(answer);
    }
}
