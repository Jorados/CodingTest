package CodingTest.Greedy;


import java.util.*;
// 꽃이 피는 최단시간 - 그리디

class Flower implements Comparable<Flower> {
    public int T;
    public int G;
    public Flower(int T,int G){
        this.T = T;
        this.G = G;
    }
    @Override
    public int compareTo(Flower o) {
        if(o.T == this.T) return o.G - this.G;
        return o.T - this.T;
    }

}
public class ex4 {
    static int n,answer=0;
    static int planTime[];
    static int growTime[];

    public static void solution(){
        ArrayList<Flower> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(new Flower(planTime[i], growTime[i]));
        }

        Collections.sort(list);
        //3 3
        //2 2
        //1 2
        int start = 0;
        int end = 0;
        for(Flower x : list){
            end = start + x.T + x.G;
            answer = Math.max(answer,end);
            start += x.T;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        planTime = new int[n];
        for(int i=0; i<n; i++){
            planTime[i] = sc.nextInt();
        }
        growTime = new int[n];
        for (int i=0; i<n; i++){
            growTime[i] = sc.nextInt();
        }
        solution();
        System.out.println(answer);
    }
}
