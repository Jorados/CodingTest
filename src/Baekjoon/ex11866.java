package Baekjoon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 - 요세푸스 문제0 - S5
public class ex11866 {

    static int n,m;
    static int cnt=1;
    static Queue<Integer> Q = new LinkedList<>();
    static ArrayList<Integer> arr = new ArrayList<>();
    public static ArrayList<Integer> solution(){
        for(int i=1; i<=n; i++) Q.offer(i);

        while(!Q.isEmpty()){
            if(cnt==m){
                arr.add(Q.poll());
                cnt=1;
                continue;
            }
            Q.offer(Q.poll());
            cnt++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();

        System.out.print("<");
        for(int x : solution()){
            if(arr.lastIndexOf(x)==n-1){
                System.out.print(x);
            }
            else System.out.print(x + ",");
        }
        System.out.print(">");
    }
}
