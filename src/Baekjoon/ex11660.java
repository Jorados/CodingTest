package Baekjoon;


import java.util.Scanner;

// 구간 합 구하기 5
public class ex11660 {

    static int n,m;
    static int[][] map;
    static int sX,sY,eX,eY;
    static long answer=0;

    public static void solution(){
        long sum=0;
        for(int i=sX; i<=eX; i++){

        }

        answer = sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j]=sc.nextInt();
            }
        }

        while(m-- >0){
            sX = sc.nextInt() - 1;
            sY = sc.nextInt() - 1;
            eX = sc.nextInt() - 1;
            eY = sc.nextInt() - 1;

            solution();
            System.out.println(answer);
            answer=0;
        }


    }
}
