package CodingTest.Hashing;


import java.util.*;

// 서로 다른 빈도수 만들기
public class ex3 {

    static String s;
    static int answer=0;

    public static void solution() {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(char key : map.keySet()){
            while(set.contains(map.get(key))){
                answer++;
                map.put(key,map.get(key)-1);
            }
            if(map.get(key)==0) continue;
            set.add(map.get(key));
            // set에서 안겹치기 위해 -1을 하는데,
            // 원래 값이 1 이었던 값은 0이 되면
            // !!문자열에서 사라지는 것을 뜻한다!!
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        s = sc.nextLine();
        solution();
        System.out.println(answer);
    }
}
