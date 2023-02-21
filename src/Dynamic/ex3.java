package Dynamic;

import java.util.Map;
import java.util.Scanner;

//최대부분 증가수열
public class ex3 {
    static int n;
    static int[] arr;
    static int[] dy;
    public static int solution(){
        int answer=0;
        dy[0]=1;
        for(int i=0; i<n; i++){
           int max=0;
           for(int j=i-1; j>=0; j--){
               if(arr[j]<arr[i] && dy[j]>max) max=dy[j];
           }
            dy[i]=max + 1;
            answer = Math.max(answer,dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        dy = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution());
    }
}
