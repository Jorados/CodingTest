package CodingTest.DataStructure;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 최대 길이 연속 수열
public class ex1 {

    static int n;
    static int[] arr;
    static int answer=0;
    public static void solution(){
        Set<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }

        for(int x : set){
            // x보다 1작은 숫자있으면 이미 카운팅 된것임. 계속 진행
            if(set.contains(x-1)) continue;

            int cnt=0;
            // 아니면 이 x가 시작 숫자가되어 진행
            while(set.contains(x)){
                cnt++;
                x++;
            }
            answer = Math.max(answer,cnt);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            n = sc.nextInt();
        }
        solution();
    }
}
