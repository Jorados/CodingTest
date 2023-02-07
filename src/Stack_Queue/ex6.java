package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//공주구하기
public class ex6 {
    public static int solution(int n,int m) {
        int answer=0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            for(int i=1; i<=m; i++){
                if(i==m) Q.poll();
                else{
                    Integer poll = Q.poll();
                    Q.offer(poll);
                }
            }
            if(Q.size()==1) break;
        }
        answer=Q.poll();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(n,m));
    }
}
