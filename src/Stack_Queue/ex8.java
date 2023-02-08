package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int num;
    int priority;
    public Person(int num, int x) {
        this.num = num;
        this.priority = x;
    }
}

//환자진료
public class ex8 {
    static Queue<Person> Q = new LinkedList<>();
    public static int solution(int n,int m){
        int answer=0; int max=0;
        while(!Q.isEmpty()) {
            Person poll = Q.poll();
            for(Person x : Q){
                if(poll.priority<x.priority){
                    Q.offer(poll);
                    poll=null;
                    break;
                }
            }

            if(poll!=null){
                answer++;
                if(poll.num == m) return answer;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            Q.offer(new Person(i,sc.nextInt()));
        }

        System.out.println(solution(n,m));
    }
}
