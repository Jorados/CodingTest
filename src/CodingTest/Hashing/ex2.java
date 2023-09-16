package CodingTest.Hashing;
import java.util.*;

// 같은 빈도 수 만들기
public class ex2 {
    static String s;
    public static void solution(){
        Map<Character,Integer> map = new HashMap<>();
        char[] ctr = s.toCharArray();
        for(int i=0; i<ctr.length; i++){
            map.put(ctr[i],map.getOrDefault(ctr[i],0)+1);
        }

        int max=Integer.MIN_VALUE;
        for(Character c : map.keySet()){
            if(map.get(c) > max){
                max = map.get(c);
            }
        }

        Map<Character,Integer> map2 = new HashMap<>();
        map2.put('a',0);
        map2.put('b',0);
        map2.put('c',0);
        map2.put('d',0);
        map2.put('e',0);

        for(Character c : map2.keySet()){
            if(map.containsKey(c) && map.get(c) == max) continue;
            else if(map.containsKey(c) && map.get(c) < max){
                map2.put(c,(max - map.get(c)));
            }
            else if(!map.containsKey(c)){
                map2.put(c,max);
            }
        }

        for(Character c : map2.keySet()){
            System.out.print(map2.get(c) + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        solution();
    }
}
