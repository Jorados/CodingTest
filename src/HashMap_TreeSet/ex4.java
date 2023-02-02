package HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ex4 {
    public static int solution(String T, String S){
        int answer =0;
        int lt=0,rt=0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : S.toCharArray()){
            map2.put(x,map2.getOrDefault(x,0) + 1);
        }

        for(int i=0; i<S.length()-1; i++){
            map1.put(T.charAt(i),map1.getOrDefault(T.charAt(i),0) + 1);
        }

        for(rt=S.length()-1; rt<T.length(); rt++){
            map1.put(T.charAt(rt),map1.getOrDefault(T.charAt(rt),0) + 1);
            if(map1.equals(map2)) answer++;
            map1.put(T.charAt(lt),map1.get(T.charAt(lt))-1);
            if(map1.get(T.charAt(lt))==0) map1.remove(T.charAt(lt));
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solution(s1,s2));
    }
}
