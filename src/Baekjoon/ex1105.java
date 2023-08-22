package Baekjoon;


import java.util.Scanner;

// 팔 - 그리디
public class ex1105 {

    static int L;
    static int R;
    static int answer=0;

    public static void solution(){
        char[] ctr1 = Integer.toString(L).toCharArray();
        char[] ctr2 = Integer.toString(R).toCharArray();

        if(ctr1.length == ctr2.length){
            for(int i=0; i<ctr1.length; i++){
                if(ctr1[i] != ctr2[i]) break;
                else if(ctr1[i]=='8') answer++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        L = sc.nextInt();
        R = sc.nextInt();

        solution();
        System.out.println(answer);
    }
}
