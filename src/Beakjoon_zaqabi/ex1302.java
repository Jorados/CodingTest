package Beakjoon_zaqabi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

// 베스트셀러 - S4
public class ex1302 {

    public static String solution(String[] arr){
        String answer="";

        HashMap<String , Integer> map = new HashMap<>();

        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        // 키 값으로 오름차순 정렬
        ArrayList<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        Integer max = Collections.max(map.values());

        for(String s : keySet){
            if(map.get(s)==max){
                answer=s;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i]  = sc.next();
        }

        System.out.println(solution(arr));
    }
}
