package Beakjoon_zaqabi;


import java.util.ArrayList;
import java.util.Scanner;

// 한국이 그리울 땐 서버에 접속하지 - S3
public class ex9996 {

    public static ArrayList<String> solution(int n,String s, String[] arr){
        ArrayList<String> answer = new ArrayList<>();

        // '*'을 기준으로 문자열을 나누는 법.
        String[] split = s.split("\\*");

        for(String str : arr){
            if(str.length() < split[0].length() + split[1].length()){
                answer.add("NE");
            }
            else{
                String front = str.substring(0, split[0].length());
                String back = str.substring(str.length() - split[1].length(), str.length());

                if(front.equals(split[0]) && back.equals(split[1])){
                    answer.add("DA");
                }
                else answer.add("NE");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }

        for(String str : solution(n,s,arr)){
            System.out.println(str);
        }
    }
}
