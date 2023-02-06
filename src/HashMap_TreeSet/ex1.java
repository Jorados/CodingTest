package HashMap_TreeSet;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex1 {

    public static char solution(int n,String s) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max= Integer.MIN_VALUE;
        for(Character c : map.keySet()){
            if(map.get(c)>max){
                max=map.get(c);
                answer=c;
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
