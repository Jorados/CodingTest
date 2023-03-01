import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            Map<Integer,Integer> map = new HashMap<>();
            int cnt=0,num=0;

            for(int j=1; j<=N; j++){
                for(int i=0; i<stages.length; i++){
                    if(stages[i] >= j) cnt++;
                    if(stages[i] == j) num++;
                }
                float fail = num/cnt;
            }

            return answer;
        }
    }
}
