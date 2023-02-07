package Stack_Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육과정 설계
public class ex7 {
    public static String solution(String s1, String s2){
        String answer="YES";
        Queue<Character> Q = new LinkedList<>();
        for(char c : s1.toCharArray()) Q.offer(c);

        for(char c : s2.toCharArray()){
            if(Q.contains(c)){
                if(Q.poll()!=c) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solution(s1,s2));
    }
}
