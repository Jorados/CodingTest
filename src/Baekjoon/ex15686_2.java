package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 피자 배달 거리
public class ex15686_2 {
    static int n,m;
    static ArrayList<Points> hs = new ArrayList<>();
    static ArrayList<Points> pz = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;
    public static void DFS(int L,int s){
        if(L==m){
            int sum=0;
            for(Points h : hs){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis,Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum+=dis;
            }
            answer = Math.min(answer,sum);
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

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp = sc.nextInt();
                if(tmp==1) hs.add(new Points(i,j));
                else if(tmp==2) pz.add(new Points(i,j));
            }
        }

        combi = new int[m];
        DFS(0,0);
        System.out.println(answer);
    }
}
