package TwoPointers_SlidingWindow;


import java.util.Scanner;

//연속된 자연수의 합
public class ex5 {
    public static int solution(int n) {
        int answer=0;
        int lt=1,rt=1;
        int sum=0;

        while(rt<=n){
            if(sum==n){
                answer++;
                sum+=rt++;
            }
            else if(sum>n) sum-=lt++;
            else if(sum<n) sum+=rt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
