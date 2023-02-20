package Dynamic;

import java.util.Scanner;

//최대부분 증가수열
public class ex3 {
    static int n;
    static int[] arr;
    public static int solution(){
        int answer=0;


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution());
    }
}
