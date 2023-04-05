package Beakjoon_zaqabi;


import java.util.Scanner;

// 동전 1 - G5 -> 다이나믹으로 풀어야함..
public class ex2293 {

    static int n,m;
    static int[] arr;
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1];
        dy = new int[m+1];
        dy[0]=1; //여기에 1을 선언 해줘야 1원으로 1을 구하는 경우에 1이 들어감.

        for(int i=1; i<=n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1; i<=n; i++){
            for(int j=arr[i]; j<=m; j++){
                dy[j]+=dy[j-arr[i]];
            }
        }
        System.out.println(dy[m]);
    }
}
