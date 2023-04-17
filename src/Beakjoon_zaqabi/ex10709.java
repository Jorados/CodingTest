package Beakjoon_zaqabi;


import java.util.ArrayList;
import java.util.Scanner;

// 기상 캐스터 - S5
public class ex10709 {
    static int n,m;
    static String[] board;
    public static void solution(){
        int[][] answer= new int[n][m];
        boolean flag=false;
        int cnt=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<board[i].length(); j++) {
                char c = board[i].charAt(j);

                if (c=='c') {
                    answer[i][j] = 0;
                    flag = true;
                    cnt = 0;
                }
                else {
                    if (flag == false) answer[i][j] = -1;
                    if (flag == true) {
                        cnt++;
                        answer[i][j] = cnt;
                    }
                }
            }
            flag=false;
            cnt=0;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        board = new String[n];
        for(int i=0; i<n; i++){
            board[i]=sc.next();
        }
        solution();
    }
}
