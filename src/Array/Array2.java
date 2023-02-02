package Array;

import java.util.Scanner;

//입력
//8
//130 135 148 140 145 150 150 153
//출력
//5
public class Array2 {
    public static int solution(int n, int[] number){
        int answer = 1;
        int p = number[0];

        for(int i=1; i<number.length; i++){
            if(number[i] > p){
                p = number[i];
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        System.out.println(solution(n,number));
    }
}
