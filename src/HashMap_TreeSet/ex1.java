package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ex1 {

    public static char solution(int n, String s){
        char answer =' ';
        HashMap<Character, Integer> map = new HashMap<>();
        int max =0;
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(solution(n,s));
    }
}
