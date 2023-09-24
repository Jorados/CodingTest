package CodingTest.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 카드 가져가기
class AA{
    int differ;
    int idx;
    public AA(int differ,int idx){
        this.differ = differ;
        this.idx = idx;
    }
}
public class ex3 {
    static int n;
    static Integer[] arr;
    static int k,answer=0;

    public static void solution() {
        int turn = n/2;

        Arrays.sort(arr, Collections.reverseOrder());
        // 12 12 8 7 5 3 3 1 1 1
        // 정석대로 간다면

        // 영희 : 12 8 5 3 1 -> 29
        // 현수 : 12 7 3 1 1 -> 24

        // 정석대로의 값들을 서로다른 리스트에 담아서?
        // 각 위치의 값들의 차의 max를 구해서 answer에 더해주자.
        ArrayList<Integer> hee = new ArrayList<>(); //영희
        ArrayList<Integer> soo = new ArrayList<>(); //현수

        for(int i=0; i<n; i++){
            if(i%2==0) hee.add(arr[i]);
            else if(i%2==1) soo.add(arr[i]);
        }

        for(int x : soo) answer+=x;

        // k 만큼의 차이의 값을 answer에 추가로 더해주자.
        // 그리고 제거해야함.
        while(k>0){
            int max = Integer.MIN_VALUE;
            int idx = 0;
            for(int i=0; i<hee.size(); i++){
                int dif = hee.get(i) - soo.get(i);
                // 차의 최댓값을 구한다.
                if(dif > max){
                    max = dif;
                    idx = i;
                }
            }
            hee.remove(idx);
            soo.remove(idx);

            answer+=max;
            k--;
        }



    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        k = sc.nextInt();

        solution();
        System.out.println(answer);
    }
}
