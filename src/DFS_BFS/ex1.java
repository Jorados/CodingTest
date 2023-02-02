package DFS_BFS;

import java.util.Scanner;

public class ex1 {
    static int n, total = 0;
    static String answer = "NO";

    public static void DFS(int L, int sum, int[] arr) {
        if (sum > total / 2) return; //부분집합 완성 전에.
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
