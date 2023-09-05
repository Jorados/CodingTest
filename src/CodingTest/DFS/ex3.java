package CodingTest.DFS;


import java.util.ArrayList;
import java.util.Scanner;

// 바둑대회
class Doll{
    int black;
    int white;
    public Doll(int black,int white){
        this.black = black;
        this.white = white;
    }
}
public class ex3 {
    static int n;
    static int[][] doll;
    static boolean[] ch;
    static int answer=Integer.MAX_VALUE;
    static ArrayList<Doll> all = new ArrayList<>();
    public static void DFS(int sum1,int sum2){
        int cnt=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i]) cnt++;
        }

        if(cnt == n/2){
            for(int i=0; i<all.size(); i++){
                if(!ch[i]) sum2+=all.get(i).white;
            }
            answer = Math.min(answer,Math.abs(sum1-sum2));
        }

        for(int i=0; i<n; i++){
            if(!ch[i]){
                ch[i]=true;
                DFS(sum1+all.get(i).black,0);
                ch[i]=false;
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            all.add(new Doll(doll[i][0],doll[i][1]));
        }
        DFS(0,0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        doll = new int[n][2];
        ch = new boolean[n];
        for(int i=0; i<n; i++){
            doll[i][0] = sc.nextInt();
            doll[i][1] = sc.nextInt();
        }
        solution();
        System.out.println(answer);
    }
}
