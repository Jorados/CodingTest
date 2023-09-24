package CodingTest.Sorting;


import java.util.*;

// 수열 찾기
public class ex2 {
    static int n;
    static int[] arr;
    static PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
    static ArrayList<Integer> answer= new ArrayList<>();
    public static void solution(){
        for(int x : arr){
            Q.offer(x);
        }
        int size=arr.length;
        int cnt=0;
        // 역순으로 나온다
        while (!Q.isEmpty()){
            if(cnt >= size) break;

            Integer poll = Q.poll();
            int num = poll / 2;

            if(Q.contains(num)) {
                answer.add(num);
                Q.remove(num);
            }
            cnt++;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }

        solution();
        for(int i=answer.size()-1; i>=0; i--){
            System.out.print(answer.get(i) + " ");
        }
    }
}
