package CodingTest.Hashing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 한 번 사용한 최초 문자
public class ex1 {
    static String s;
    static int answer=0;

    public static void solution() {

        Map<Character,Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();

        char[] ctr = s.toCharArray();
        for(int i=0; i<ctr.length; i++){
            map.put(ctr[i], map.getOrDefault(ctr[i],0)+1);
            list.add(ctr[i]);
        }

        for(Character c : map.keySet()){
            if(map.get(c)==1){
                answer = list.indexOf(c) + 1;
                break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();
        solution();
        if(answer==0) System.out.println(-1);
        else System.out.println(answer);
    }
}
