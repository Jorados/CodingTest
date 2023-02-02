package Stack_Queue;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//응급실
//순서를 따져서 뒤로보내고 뒤로보내고 해야하기 때문에
//Queue 사용
//5 2
//60 50 70 80 90
//-->3
class ex8 {
    public static int solution(int n,int k,int[] arr){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0; i<n; i++){
            Q.offer(new Person(i,arr[i]));
        }
        //Q --> (0,60) (1,50) (2,70) (3,80) (4,90)

        while(!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                if (tmp.rank < x.rank) {
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==k) return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}

class Person{
    int id;
     int rank;

    public Person(int id, int rank) {
        this.id = id;
        this.rank = rank;
    }
}
