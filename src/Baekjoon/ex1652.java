package Baekjoon;


import java.util.Scanner;

// 누울 자리를 찾아라 - S5
public class ex1652 {
    static int n;
    static String[] board;
    static char[][] arr;
    static int a; //수직
    static int b; //수평

    public static void solution(){
        for(int i=0; i<n; i++){
            String[] str = board[i].split("");
            for(int j=0; j<n; j++){
                arr[i][j]=str[j].charAt(0);
            }
        }

        for(int i=0; i<n; i++){
            int check_a=0,check_b=0;
            for(int j=0; j<n; j++){
                //가로
                if(arr[i][j]=='.') check_b++;
                if(arr[i][j]=='X' || j==n-1){
                    if(check_b>=2) a++;
                    check_b=0;
                }
                //세로
                if(arr[j][i]=='.') check_a++;
                if(arr[j][i]=='X' || j==n-1){
                    if(check_a>=2) b++;
                    check_a=0;
                }
            }
        }
        System.out.print(a+" "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();
        board = new String[n];
        arr = new char[n][n];
        for(int i=0; i<n; i++){
            board[i]=sc.next();
        }
        solution();
    }
}
