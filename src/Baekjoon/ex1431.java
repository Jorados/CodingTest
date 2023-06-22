package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// 시리얼 번호 - S3 - 정렬
public class ex1431 {

    static int n;
    static ArrayList<String> arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.next());
        }

        // 1. 길이가 짧은 순
        // 2. 길이가 같다면 , 문자에 속한 숫자의 합이 적은 순
        // 3. 이렇게 해도 안되면 , 그냥 사전순 정렬

        Collections.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) { // 길이가 같을 때
                    if(sum(o1) == sum(o2)) return o1.compareTo(o2); // 합이 같으면 사전순
                    else return sum(o1) - sum(o2); // 합이 다르면 오름차순
                }
                else {
                    return o1.length() - o2.length(); // 길이 다르면 작은순 오름차
                }
            }

            // 숫자 합구하기
            private int sum(String str) {
                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    int num = str.charAt(i) - '0';
                    if(num >= 0 && num <= 9) sum += num;
                }
                return sum;
            }

        });

        for(int i=0; i<n; i++){
            System.out.println(arr.get(i));
        }
    }


}
