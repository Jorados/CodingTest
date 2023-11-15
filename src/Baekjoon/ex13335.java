package Baekjoon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 트럭
class Clear{
    int kg;
    int t;
    public Clear(int kg,int t) {
        this.kg = kg;
        this.t = t;
    }
}
public class ex13335 {

    static int n,w,l;
    static ArrayList<Integer> trucks;
    static int answer=0;
    public static void solution(){
        Queue<Clear> Q = new LinkedList<>();
        int sum=0;

        sum+=trucks.get(0);
        Q.offer(new Clear(trucks.get(0),w));
        trucks.remove(0);


        while (!Q.isEmpty()){
            if(Q.peek().t==0) {
                Clear poll = Q.poll();
                sum -= poll.kg;
            }

            if(trucks.size()>0 && Q.size()<w){
                if(sum+trucks.get(0) <= l){
                    int cnt=0;
                    while (cnt < Q.size()){
                        Clear poll = Q.poll();
                        Q.offer(new Clear(poll.kg,poll.t-1));
                        cnt++;
                    }
                    Q.offer(new Clear(trucks.get(0),w));
                    sum+=trucks.get(0);
                    trucks.remove(0);
                }
                else if(sum+trucks.get(0) > l){
                    int cnt=0;
                    while (cnt < Q.size()){
                        Clear poll = Q.poll();
                        Q.offer(new Clear(poll.kg,poll.t-1));
                        cnt++;
                    }
                }
            }
            else{
                int cnt=0;
                while (cnt < Q.size()){
                    Clear poll = Q.poll();
                    Q.offer(new Clear(poll.kg,poll.t-1));
                    cnt++;
                }
            }

            answer++;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        w = sc.nextInt();
        l = sc.nextInt();

        trucks = new ArrayList<>();
        for(int i=0; i<n; i++){
            trucks.add(sc.nextInt());
        }

        solution();
        System.out.println(answer);
    }
}
