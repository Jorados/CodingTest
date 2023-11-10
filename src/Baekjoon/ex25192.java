package Baekjoon;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 인사성 밝은 곰곰이
public class ex25192 {
    static int n,answer=0;
    static String[] str;
    public static void solution(){
        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(str[i].equals("ENTER")){
                answer += set.size();
                set.clear();
            }
            else{
                set.add(str[i]);
            }
        }

        answer+=set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }

        solution();
        System.out.println(answer);
    }
}
