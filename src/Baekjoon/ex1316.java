package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1316 {

    static ArrayList<Character> list = new ArrayList<>();
    static int cnt=0;

    public static int solution(int n, String[] arr){
        int answer=0;
        //이전에 나왔던 숫자가 연달아 나오는게 아니면 x
        for(String x : arr){
            char[] c = x.toCharArray();
            for(int i=0; i<c.length; i++){
                if(list.contains(c[i])){
                    cnt=1;
                    break;
                }
                else list.add(c[i]);
            }
            if(cnt==0) answer++;
            else if(cnt!=0) cnt=0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        System.out.println(solution(n,arr));
    }
}
