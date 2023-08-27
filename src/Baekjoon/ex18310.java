package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 안테나 - 그리디
public class ex18310 {

    static int n;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void solution(){
        Collections.sort(list);

        if(n%2==0){
            System.out.println(list.get(n/2-1));
        }
        else System.out.println(list.get(n/2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        solution();
    }
}
