import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    class Solution {
        public ArrayList<Integer> solution(String s) {
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Character> answer = new ArrayList<>();

            for(char c : s.toCharArray()){
                if(!answer.contains(c)) arr.add(-1);
                if(answer.contains(c)){
                    int x = answer.indexOf(c);
                }
                answer.add(c);
            }


            return arr;
        }
    }
}
