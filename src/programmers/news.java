package programmers;

import java.util.Scanner;
import java.util.*;

public class news {
    static String str1;
    static String str2;

    public static int solution(){
        int answer = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // 1.두 문자를 2문자씩 쪼개서 교집합, 합집합을 구한다.
        // 2.유사도값을 구한다. (교집합/합집합 = 유사도)
        // 공백이나 숫자,특수문자가 들어있는 경우는 그 글자 쌍을 버린다.
        // 65536을 곱하고 소수점 아래를 버린다.

        ArrayList<String> s1 = new ArrayList<>();
        for(int i=0; i<str1.length()-1; i++){
            String line = str1.substring(i,i+2);
            if((line.charAt(0) >= 'a' && line.charAt(0) <= 'z') &&
                    (line.charAt(1) >= 'a' && line.charAt(1) <= 'z')){
                s1.add(line);
            }
        }

        ArrayList<String> s2 = new ArrayList<>();
        for(int i=0; i<str2.length()-1; i++){
            String line = str2.substring(i,i+2);
            if((line.charAt(0) >= 'a' && line.charAt(0) <= 'z') &&
                    (line.charAt(1) >= 'a' && line.charAt(1) <= 'z')){
                s2.add(line);
            }
        }

        // fr an ce
        // fr en ch
        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();

        //합,교 구하기
        for(String x1 : s1){
            if(s2.contains(x1)){
                intersection.add(x1);
                s2.remove(x1);
            }
            union.add(x1);
        }

        for(String x2 : s2){
            union.add(x2);
        }


        double num = 0;
        if(union.size()==0) num = 1;
        else num = (double) intersection.size() / (double) union.size();

        return (int) (num * 65536);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        str1 = sc.nextLine();
        str2 = sc.nextLine();

        System.out.println(solution());
    }
}
