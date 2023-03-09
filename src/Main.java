import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "Yes";

            //순서가 안맞으면 "NO";
            //투포인터로 해볼까?
            int lt=0,rt=0;

            for(int i=0; i<goal.length; i++){
                if(goal[i]==cards1[lt]){
                    lt++; continue;
                }
                else if(goal[i]==cards2[rt]) rt++;
                else if(goal[i]==cards1[lt] && goal[i]==cards2[rt]){
                    lt++;
                    rt++;
                }
                // else answer="No";

            }
            System.out.print(lt);
            System.out.print(rt);
            return answer;
        }
    }
}
