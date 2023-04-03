package Beakjoon_zaqabi;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 농구 경기 - B2
public class ex1159 {
    static int n;
    static String[] arr;

    public static void solution(){
        String answer="";
        int cnt=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i].charAt(0), map.getOrDefault(arr[i].charAt(0),0)+1);
        }

        for(char c : map.keySet()) if(map.get(c)>=5) answer+=c;

        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);

        if(answer.length()==0) System.out.println("PREDAJA");
        else System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new String[n];
        for(int i=0; i<n; i++) arr[i]=sc.next();
        solution();
    }
}
