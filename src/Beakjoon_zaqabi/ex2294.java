package Beakjoon_zaqabi;


import java.util.Arrays;
import java.util.Scanner;

// 동전2 - G5
public class ex2294 {
    static int n,m;
    static int[] coin;
    static int[] dy;
    public static int solution(){
        Arrays.fill(dy,Integer.MAX_VALUE-1);
        dy[0]=0;
        for(int i=0; i<n; i++){
            for(int j=coin[i]; j<=m; j++){
                dy[j]=Math.min(dy[j],dy[j-coin[i]]+1);
            }
        }
        if(dy[m]==Integer.MAX_VALUE-1) return -1;
        else return dy[m];
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        coin = new int[n];

        for(int i=0; i<n; i++){
            coin[i]=sc.nextInt();
        }

        dy = new int[m+1];
        System.out.println(solution());
    }
}
