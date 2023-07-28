package programmers;

import java.util.Scanner;
import java.util.*;

public class tuple {
    static String s;
    static ArrayList<Integer> answer = new ArrayList<>();
    public static void solution(){
        // 가공
        s = s.substring(1,s.length()-1);
        String[] str = s.split("}");
        for(int i=0; i<str.length; i++) {
            str[i] = str[i].replace("{","").replace(","," ");
            if(i>=1) str[i] = str[i].substring(1,str[i].length());
        }

        // 정렬
        Arrays.sort(str, (o1,o2) -> o1.length() - o2.length());

        // 정답 추출
        answer.add(Integer.valueOf(str[0]));
        for(int i=1; i<str.length; i++){
            String[] line = str[i].split(" ");

            for(String sss : line){
                if(!answer.contains(Integer.valueOf(sss))){
                    answer.add(Integer.valueOf(sss));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        s = sc.nextLine();

        solution();
        for(int x : answer){
            System.out.println(x + " ");
        }
    }
}
