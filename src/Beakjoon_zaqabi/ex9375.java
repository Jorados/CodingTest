package Beakjoon_zaqabi;


import java.util.HashMap;
import java.util.Scanner;

// 패션왕 신해빈 - S3 - 조합문제
public class ex9375 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- >0){
            HashMap<String,Integer> map = new HashMap<>();
            int m = sc.nextInt();
            while(m-- >0){
                sc.next();
                String kind = sc.next();
                map.put(kind,map.getOrDefault(kind,0)+1);
            }
            int result=1;
            for(String s : map.keySet()) result *= (map.get(s)+1);

            System.out.println(result-1);
        }

    }
}
