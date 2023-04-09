package Beakjoon_zaqabi;


import java.util.Scanner;

// 빈도 정렬 - S3
public class ex2910 {

    static int n,m;
    static int[] arr;
    static int[] answer;
    public static int[] solution(){
        answer = new int[n];



        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int x : solution()){
            System.out.print(x + " ");
        }

    }
}
