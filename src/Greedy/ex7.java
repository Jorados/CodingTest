package Greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//원더랜드 (최소스패닝트리/크루스칼)
class Load implements Comparable<Load>{
    int a;
    int b;
    int c;
    public Load(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public int compareTo(Load o) {
        return this.c - o.c;
    }
}
public class ex7 {
    static int v,e;
    static int[] unf;
    static ArrayList<Load> graph;

    public static int Find(int v){
        if(unf[v]==v) return v;
        else return unf[v]=Find(unf[v]);
    }
    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();
        graph = new ArrayList<>();
        unf = new int[v+1];
        for(int i=1; i<=v; i++) unf[i]=i;

        for(int i=0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.add(new Load(a,b,c));
        }

        int answer=0;
        Collections.sort(graph);
        for(Load x : graph){
            int fa = Find(x.a);
            int fb = Find(x.b);
            if(fa!=fb){
                answer+=x.c;
                Union(x.a,x.b);
            }
        }

        System.out.println(answer);
    }
}
