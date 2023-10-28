package Baekjoon;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 서로 다른 부분 문자열의 개수
public class ex11478 {
    static String s;
    static char[] ctr;
    static Set<String> list = new HashSet<>();
    public static void DFS(String temp, int L){
        list.add(temp);

        if(s.length()-1 <= L) return;
        DFS(temp+ctr[L+1],L+1);
    }
    public static void solution(){
        ctr = s.toCharArray();
        for(int i=0; i<ctr.length; i++){
            DFS(ctr[i]+"",i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        solution();
        System.out.println(list.size());
    }
}
