package CodingTest.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지를 잡자
public class ex3 {
    static int s; //현수
    static int e; //송아지
    static int answer=0;
    static int[] ch;
    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);
        while(!Q.isEmpty()){
            int size = Q.size();
            answer++;
            for(int i=0; i<size; i++){
                int x = Q.poll();
                int[] root = {x-1,x+1,x*2};
                for(int nx : root){
                    // 홀수 레벨과 짝수 레벨을 나눠야함. -> 왜?
                    if(nx >= 0 && nx <= 200000 && ch[nx]==0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            e+=answer;
            if(e>200000) return -1;
            else if(ch[e] == 1) return answer;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        e = sc.nextInt();

        ch = new int[200001];
        int bfs = BFS();
        System.out.println(bfs);
    }
}
