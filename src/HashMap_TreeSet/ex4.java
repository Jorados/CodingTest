package HashMap_TreeSet;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//모든 아나그램 찾기
public class ex4 {
    public static int solution(String s1, String s2){
        int answer=0;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        int lt=0,rt=0;
        char[] cs = s1.toCharArray();
        //투포인터,슬라이딩윈도우로 비교
        //그냥 map의 키값만 값으면 정답
        for(char c : s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0) + 1);
        }

        for(int i=0; i<map2.size(); i++){
            map1.put(cs[i],map1.getOrDefault(cs[i],0)+1);
        }
        if(map1.equals(map2)) answer++;

        for(rt=map2.size(); rt<s1.length(); rt++){
            map1.put(cs[rt],map1.getOrDefault(cs[rt],0)+1);
            map1.put(cs[lt],map1.getOrDefault(cs[lt],0)-1);
            if(map1.get(cs[lt])==0) map1.remove(cs[lt]);
            lt++;
            if(map1.equals(map2)) answer++;
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
