package Baekjoon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 - 회전하는 큐 - S3
public class ex1021 {

    static LinkedList<Integer> list = new LinkedList<>();

    public static int solution(int n, int m , int[] arr){
        int answer=0;

        for(int i=1; i<=n; i++) list.add(i);

        for(int x : arr){
            int index = list.indexOf(x);
            int hdex = list.size()/2;

            if(index <= hdex){
                while(x!=list.getFirst()){
                    list.add(list.removeFirst());
                    answer++;
                }
            }
            else{
                while(x!=list.getFirst()){
                    list.addFirst(list.removeLast());
                    answer++;
                }
            }
            list.remove();
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }
}
