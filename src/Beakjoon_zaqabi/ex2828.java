package Beakjoon_zaqabi;


import java.util.Scanner;

// 사과 담기 게임 - S5
public class ex2828 {
    // 스크린 n칸  1~n
    // 바구니 크기 m칸
    // 2째 줄 입력 --> 사과 떨어지느 횟수 k
    // 상근이 최단거리 움직임을 구하는 문제.
    static int n,m;
    static int k;
    static int[] arr;
    public static int soluiton(){
        int answer=0; //움직인 회수
        int left=1; //바구니위치
        int right=m;

        for(int x : arr){
            //x-> 사과 떨어지는 위치
            if(x>=left && x<=right) continue;

            if(left > x){
                answer+=(left-x);
                right-=(left-x);
                left=x;
            }
            else{
                answer+=(x-right);
                left+=(x-right);
                right=x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(soluiton());
    }


}
