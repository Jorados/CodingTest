package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex25757{

    static int n;
    static String ctr;
    static String[] human;

    static int answer=0;
    public static void solution() {
        // Y --> 2명일 때 진행가능 ( 새로운 사람 1명마다 answer++)
        // F --> 3명일 떄 진행가능 ( 새로운 사람 2명마다 answer++)
        // O --> 4명일 때 진행가능 ( 새로운 사람 3명마다 answer++)

        // 그냥 새로운 사람 수 세고 게임에 따라 나누기 떄리자.
        Set<String> set = new HashSet<>();
        for(String x : human){
            set.add(x);
        }

        if(ctr.equals("Y")){
            answer = set.size()/1;
        }
        else if(ctr.equals("F")){
            answer = set.size()/2;
        }
        else answer = set.size()/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ctr = sc.next();


        human = new String[n];
        for(int i=0; i<n; i++){
             human[i] = sc.next();
        }

        solution();
        System.out.println(answer);
    }
}
