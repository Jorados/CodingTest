package programmers;
import java.util.*;

class Point{
    int num;
    int idx;
    public Point(int num,int idx){
        this.num = num;
        this.idx = idx;
    }
}
public class process {
        public static int solution(int[] priorities, int location) {
            int answer = 1;
            Queue<Point> Q =  new LinkedList<>();
            int max = Integer.MIN_VALUE;

            for(int i=0; i<priorities.length; i++){
                Q.offer(new Point(priorities[i],i));
                max = Math.max(max,priorities[i]);
            }

            while(!Q.isEmpty()){
                Point x = Q.poll();
                //최대값 + location
                if(x.idx == location && x.num == max) return answer;
                    //최대값
                else if(x.num == max){
                    answer++;
                    for(Point nx : Q) {
                        max = Math.max(max,nx.num);
                    }
                }
                //아닐 때
                else Q.offer(x);
            }
            return answer;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(solution(arr,m));
    }
}

