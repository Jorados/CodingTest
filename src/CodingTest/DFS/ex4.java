package CodingTest.DFS;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// 팰린드롬의 경우의 수
public class ex4 {

    static String s = "";
    static HashSet<String> answer = new HashSet<>();
    static HashMap<Character,Integer> map = new HashMap<>();
    static boolean[] ch;

    public static void DFS(String tmp){
        // 역순 비교 (문자열 -> equals)
        if(tmp.length() == s.length()) {
            String tmp2="";
            for(int i=tmp.length()-1; i>=0; i--){
                tmp2 += tmp.charAt(i);
            }
            if(tmp.equals(tmp2)) answer.add(tmp);
        }

        for(int i=0; i<s.length(); i++){
            if(!ch[i]){
                ch[i]=true;
                DFS(tmp+s.charAt(i));
                ch[i]=false;
            }
        }
    }
    public static void solution(){
        for(Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        boolean flag = false;
        if(s.length() % 2 == 0) flag=true;
        // 짝수면 -> 구성이 전부 짝수
        if(flag){
            for(char c : map.keySet()){
                if(map.get(c)%2 !=0) return;
            }
        }
        // 홀수면 -> 한 문자는 무조건 1개(혹은 홀수) , 나머지는 짝수여야 한다.
        else if(!flag){
            int cnt=0;
            for(char c : map.keySet()){
                if(map.get(c)%2 !=0) cnt++;
            }
            if(cnt>1) return;
        }
        // 살아남으면 경우의 수 시작.
        DFS("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();
        ch = new boolean[s.length()];
        solution();
        for(String str : answer){
            System.out.println(str);
        }
    }
}
