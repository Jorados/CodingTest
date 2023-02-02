package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//공주 구하기
// 8 3
//--> 7
public class ex6 {
    public static int solution(int n1,int k){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<=n1; i++) Q.offer(i); //Q : 1 2 3 4 5 6 7 8

        while(!Q.isEmpty()){
            for(int i=1; i<k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size()==1) answer = Q.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(solution(n1,n2));
    }

}
