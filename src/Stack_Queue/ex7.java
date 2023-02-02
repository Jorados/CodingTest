package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//교육과정 설계
//CBA
//CBDAGE
//->YES
public class ex7 {
    public static String solution(String s,String x){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char c : s.toCharArray()){
            Q.offer(c);
        }

        for(char c : x.toCharArray()){
            if(Q.contains(c)){
                if(c!=Q.poll()) return "NO";
            }
        }

        if(!Q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String x = sc.next();
        System.out.println(solution(s,x));
    }
}
