package CodingTest.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 타일 점프
public class ex1 {
    static int n;
    static int[] arr;
    static boolean[] ch;
    static int answer=0;
    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(0);
        ch[0]=true;

        while(!Q.isEmpty()){
            Integer len = Q.size();
            answer++;
            for(int i=0; i<len; i++){
                Integer poll = Q.poll();
                for(int j=1; j<=arr[poll]; j++){
                    int nx = poll + j;
                    if(nx == arr.length-1) return answer;
                    if(nx < arr.length && !ch[nx]){
                        ch[nx] = true;
                        Q.offer(nx);
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ch = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int bfs = BFS();
        System.out.println(bfs);
        //System.out.println(answer);
    }
}
