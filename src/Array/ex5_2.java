package Array;

import java.util.Scanner;

public class ex5_2 {

    static int[] ch;
    public static int solution(int n){
        int answer=0;

        for(int i=2; i<=n; i++){
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
        ch = new int[n+1];
        System.out.println(solution(n));
    }
}
