package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 치킨 배달

class Points{
    int x;
    int y;
    public Points(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
public class ex15686 {
    static int n;
    static int m;
    static ArrayList<Points> hs;
    static ArrayList<Points> pz;
    static int[] combi;
    static int dis =Integer.MAX_VALUE;
    static int sum = 0;
    static int answer = Integer.MAX_VALUE;
    public static void DFS(int L,int s){
        if(L==m){
            for(Points h : hs){
                for(int i : combi){
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
                dis=Integer.MAX_VALUE;
            }
            answer = Math.min(answer,sum);
            sum=0;
        }

        else{
            for(int i=s; i<pz.size(); i++){
                combi[L]=i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp = sc.nextInt();
                if(tmp == 1) hs.add(new Points(i,j));
                else if (tmp == 2) pz.add(new Points(i,j));
            }
        }

        combi = new int[m];
        DFS(0,0);
        System.out.println(answer);
    }
}
