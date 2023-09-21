package CodingTest.Hashing;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 음수가 있는 부분수열
public class ex4 {

    static int n;
    static int[] arr;
    static int m;
    static int answer=0;

    public static void solution(){
        // 외우자
        // 음수가 있는 부분수열에서 m의 값이 되는 경우의 수를 찾아라.
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int x : arr){
            sum+=x;
            if(map.containsKey(sum-m)) answer+=map.get(sum-m);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        // 2 2 3 -1 -1 -1 3 1 1
        // m = 5
        // 0 2 4 7 6 5 8 9 10 --> sum에다가 계속 arr[i]를 더해가면서
                                // 만약에 이미 존재한다면 기존 값에 +1
        // 1 1 2 2 1 1 1 1 1
        // answer 1 2 3 4 5
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        m = sc.nextInt();
        solution();
        System.out.println(answer);
    }
}
