package HashMap_TreeSet;


import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//k번째 큰 수
public class ex5 {

    public static int solution(int n,int m,int[] arr){
        int answer=-1;
        TreeSet<Integer> TS = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    TS.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt=1;
        for(int x : TS){
            cnt++;
            if(cnt==m) answer=x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
