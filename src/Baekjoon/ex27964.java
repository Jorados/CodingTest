package Baekjoon;


import java.util.*;

// 콰트로 치즈 피자
public class ex27964 {

    static int n;
    static String[] str;

    public static void solution(){
        Set<String> set = new HashSet<>();

        for(String s : str){
            if(s.length()>=6){
                String sub = s.substring(s.length() - 6, s.length());
                if(sub.equals("Cheese")){
                    set.add(s);
                }
            }
        }

        if(set.size()>=4) System.out.println("yummy");
        else System.out.println("sad");

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();

        str= new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }

        solution();
    }
}
