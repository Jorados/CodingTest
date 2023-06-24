package Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

// 십자카드 문제 - S3 - 정렬
public class ex2659 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void solution(){
        int cnt=0;
        int answer=0;
        while(cnt<3){
            Integer num = arr.get(0);
            arr.remove(num);
            arr.add(num);
            cnt++;


//            answer = Math.max(answer,)
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++){
            arr.add(sc.nextInt());
        }
        solution();
    }
}
