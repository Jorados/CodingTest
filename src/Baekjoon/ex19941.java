package Baekjoon;


import java.util.Scanner;

// 햄버거 분배 - S3 - 그리디
public class ex19941 {
    static int n,k,cnt=0;
    static String str;
    static boolean[] ch;
    public static int solution(){
        // 거리 k 일 때 얼마나 햄버거를 먹을 수 있는 지.
        // i-k ~ i ~ i+k

        for(int i=0; i<n; i++){
            if(str.charAt(i)=='P'){
                int lt = Math.max(i-k,0);
                int rt = Math.min(i+k,n-1);
                for(int j=lt; j<=rt; j++){
                    if(str.charAt(j)=='H' && !ch[j]){
                        ch[j]=true;
                        cnt++;
                        break;
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        str = sc.next();
        ch = new boolean[n];
        System.out.println(solution());
    }
}
