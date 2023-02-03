package Array;

import java.util.Scanner;

//소수 에라토스테네스
//체크배열만들어서 배열에 체크.
public class ex5 {

    public static int solution(int n){
        int answer=0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++) {
            if(ch[i]==0){
                for(int j=i; j<=n; j=j+i){
                    ch[j]=1;
                }
                ch[i]=0;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
