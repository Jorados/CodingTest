package Baekjoon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 점수 계산
class Index implements Comparable<Index>{
    int num;
    int idx;
    public Index(int num,int idx){
        this.num = num;
        this.idx = idx;
    }

    @Override
    public int compareTo(Index o){
        return o.num - this.num;
    }
}
public class ex2822 {
    static int[] arr;
    static ArrayList<Index> list =  new ArrayList<>();
    static ArrayList<Integer> answer= new ArrayList<>();
    public static void solution(){
        int cnt=1;
        for(int x  :arr){
            list.add(new Index(x,cnt++));
        }

        Collections.sort(list);
        int sum=0;

        for(int i=0; i<5; i++){
            sum+=list.get(i).num;
            answer.add(list.get(i).idx);
        }
        Collections.sort(answer);


        System.out.println(sum);
        for(int x : answer){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        arr = new int[8];
        for(int i=0; i<8; i++){
            arr[i] = sc.nextInt();
        }

        solution();
    }
}
