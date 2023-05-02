package Baekjoon;


import java.util.*;

// 단어 정렬 - S5
public class ex1181 {

    public static void solution(String[] arr,int N){
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2); // 사전순 : compareTo
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length(); // 길이 짧은 순 : 오름차 순
                }
            }
        });


        System.out.println(arr[0]);

        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] arr = new String[N];
        in.nextLine();	// 개행 버림
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLine();
        }
        solution(arr,N);

    }

}
