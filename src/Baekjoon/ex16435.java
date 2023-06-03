package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 스네이크 버드 - S5 - 그리디
public class ex16435 {
    static int n;
    static int l;
    static int[] arr;
    public static int solution() {
        Arrays.sort(arr);

        // 1 2 3 4 5 6 7 8 9
        for(int i=0; i<arr.length; i++){
            if(l>=arr[i]) l++;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        l = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution());
    }
}
